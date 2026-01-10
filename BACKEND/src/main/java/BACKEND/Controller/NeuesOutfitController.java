package BACKEND.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static BACKEND.Service.NeuesOutfitService.*;
import BACKEND.Model.Tshirt;

@RestController
@RequestMapping("/neuesoutfit")
@CrossOrigin(origins = "*")             //damit Fronted fetch machen kann
public class NeuesOutfitController {

    private String test;
    // private final Outfitservice outfitservice;

    // Get = Anzeigen
    // Post = Hinzufügen
    // Put = Verändern
    // Delete = Löschen

    @GetMapping("/bild")
    public String bild() {
        return "assets/images/shuhe4.jpg";
    }

    @GetMapping("/testservice")
    public String testservice() {
        Tshirt shirt = nextTshirt();          //funktion aus dem Service
        String link = shirt.getBildpfad();
        return link;
    }

    @GetMapping("/test")
    public String test() {
        return "Backend läuft!";
    }

    @PostMapping
    public String add(@RequestBody String a) {
        test += "Hallo" + a;
        return test;
    }

    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable Long id) {
        //löschen
    }

    @PutMapping("/{id}")
    public void aendernTest(@PathVariable Long id, @RequestBody String b) {

    }

}
