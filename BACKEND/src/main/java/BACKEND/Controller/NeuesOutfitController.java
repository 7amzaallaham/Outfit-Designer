package BACKEND.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import BACKEND.Model.Hose;
import BACKEND.Model.Outfit;
import BACKEND.Model.Schuhe;
import BACKEND.Model.Tshirt;
import BACKEND.Service.NeuesOutfitService;

    // Get = Anzeigen
    // Post = Hinzufügen
    // Put = Verändern
    // Delete = Löschen

@RestController
@RequestMapping("/neuesOutfit")
@CrossOrigin(origins = "*")             //damit Fronted fetch machen kann
public class NeuesOutfitController {

    private final NeuesOutfitService service;
    private String test;

    public NeuesOutfitController(NeuesOutfitService service) {         //Constructor Injection
        this.service = service;
    }


    @GetMapping("/bild")
    public String bild() {
        return "assets/images/shuhe4.jpg";
    }

    @GetMapping("/nextTshirt")
    public String nextTshirt() {
        Tshirt shirt = service.nextTshirt();          //funktion aus dem Service
        String link = shirt.getBildpfad();
        return link;
    }

    @GetMapping("/nextHose")
    public String nextHose() {
        Hose hose = service.nextHose();
        String link = hose.getBildpfad();
        return link;
    }

    @GetMapping("/nextSchuhe")
    public String nextSchuhe() {
        Schuhe schuhe = service.nextSchuhe();
        String link = schuhe.getBildpfad();
        return link;
    }

    @PostMapping
    public Outfit outfitSpeichern(@RequestBody Outfit outfit) {
        return outfit;
    }

    
    @GetMapping("/backendTest")
    public void backendTest() {    //fügt ein paar daten in unsere lokale Datenbank ein damit wir sie testen können
        Tshirt tshirt1 = new Tshirt(1, "data:image/jpeg;base64,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", "blau", "adidas");
        Tshirt tshirt2 = new Tshirt(2, "data:image/jpeg;base64,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", "rot", "marke");
        Tshirt tshirt3 = new Tshirt(3, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTP5iC_r_Tm8utqtfJK3btk3Fe6g9gjnRBuUg&s", "grün", "marke");

        List<Tshirt> l = new ArrayList<>();
        l.add(tshirt1);
        l.add(tshirt2);
        l.add(tshirt3);
        service.testBackend(l);
    }

    //TESTS..........................

    // @PostMapping
    // public String add(@RequestBody String a) {
    //     test += "Hallo" + a;
    //     return test;
    // }

    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable Long id) {
        //löschen
    }

    @PutMapping("/{id}")
    public void aendernTest(@PathVariable Long id, @RequestBody String b) {

    }

}
