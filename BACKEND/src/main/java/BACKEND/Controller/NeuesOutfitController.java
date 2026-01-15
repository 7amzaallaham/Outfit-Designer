package BACKEND.Controller;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import BACKEND.Model.Hose;
import BACKEND.Model.Outfit;
import BACKEND.Model.Schuhe;
import BACKEND.Model.Tshirt;
import BACKEND.Service.NeuesOutfitService;


@RestController
@RequestMapping("/neuesOutfit")
@CrossOrigin(origins = "*")
public class NeuesOutfitController {

    private final NeuesOutfitService service;

    public NeuesOutfitController(NeuesOutfitService service) {
        this.service = service;
    }


    @GetMapping("/randomTshirt")
    public String nextTshirt() {
        Tshirt shirt = service.randomTshirt();
        String link = shirt.getBildpfad();
        return link;
    }

    @GetMapping("/randomHose")
    public String nextHose() {
        Hose hose = service.randomHose();
        String link = hose.getBildpfad();
        return link;
    }

    @GetMapping("/randomSchuhe")
    public String nextSchuhe() {
        Schuhe schuhe = service.randomSchuhe();
        String link = schuhe.getBildpfad();
        return link;
    }

    @PostMapping
    public Outfit outfitSpeichern(@RequestBody Map<String, String> outfit) {    //wandelt die json vom Frontend in eine Map um
        String tshirtBild = outfit.get("TshirtBild");
        String hoseBild = outfit.get("HoseBild");
        String schuheBild = outfit.get("SchuheBild");
        return service.outfitSpeichern(tshirtBild, hoseBild, schuheBild);
    }


    //TESTS........................................................................

    
    @GetMapping("/backendTest")
    public void backendTest() {    //fügt ein paar daten in unsere Datenbank ein damit wir sie testen können
        Tshirt tshirt1 = new Tshirt("https://tinyurl.com/3p3avnbj", "blau", "marke");
        Tshirt tshirt2 = new Tshirt("https://tinyurl.com/yappyyvv", "rot", "marke");
        Tshirt tshirt3 = new Tshirt("https://tinyurl.com/3p924zeb", "grün", "marke");
        Tshirt tshirt4 = new Tshirt("https://tinyurl.com/5fhujbsw", "gelb", "marke");
        Tshirt tshirt5 = new Tshirt("https://tinyurl.com/4tsvnra7", "weiß", "marke");
        List<Tshirt> l = List.of(tshirt1, tshirt2, tshirt3, tshirt4, tshirt5);

        Hose hose1 = new Hose("https://tinyurl.com/yubhh2cm", "schwarz", "marke");
        Hose hose2 = new Hose("https://tinyurl.com/3ppr5epr", "blau", "marke");
        Hose hose3 = new Hose("https://tinyurl.com/4xunbbxn", "grau", "marke");
        Hose hose4 = new Hose("https://tinyurl.com/2kxszubz", "weiß", "marke");
        Hose hose5 = new Hose("https://tinyurl.com/33kkap23", "braun", "marke");
        List<Hose> l2 = List.of(hose1, hose2, hose3, hose4, hose5);

        Schuhe schuhe1 = new Schuhe("https://tinyurl.com/46dr7dzh", "schwarz", "marke");
        Schuhe schuhe2 = new Schuhe("https://tinyurl.com/3wn44s7j", "rot", "marke");
        Schuhe schuhe3 = new Schuhe("https://tinyurl.com/msjmyffn", "blau", "marke");
        Schuhe schuhe4 = new Schuhe("https://tinyurl.com/4rbybjph", "weiß", "marke");
        Schuhe schuhe5 = new Schuhe("https://tinyurl.com/2fm78kz9", "grün", "marke");
        List<Schuhe> l3 = List.of(schuhe1, schuhe2, schuhe3, schuhe4, schuhe5);

        service.testBackend(l, l2, l3);
    }

}
