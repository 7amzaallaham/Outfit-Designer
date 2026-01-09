package BACKEND.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private String test;

    // Get = Anzeigen
    // Post = Hinzufügen
    // Put = Verändern
    // Delete = Löschen

    @GetMapping("/test")
    public String test() {
        return "Backend läuft!";
    }

    @PostMapping
    public String add(@RequestBody String a) {
        test += "Hallo" + " a";
        return test;
    }

    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable Long id) {
        //löschen
    }

    @PutMapping("/{id}")
    public void aendernTest(@PathVariable Long id, @RequestBody String b) {

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/bild")
    public String bild() {
        return "assets/images/shuhe4.jpg";
    }
}
