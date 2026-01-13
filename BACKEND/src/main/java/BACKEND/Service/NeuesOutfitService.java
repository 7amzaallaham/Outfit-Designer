package BACKEND.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import BACKEND.Model.Hose;
import BACKEND.Model.Kleidungsstueck;
import BACKEND.Model.Outfit;
import BACKEND.Model.Schuhe;
import BACKEND.Model.Tshirt;
import BACKEND.Repository.KleidungsstueckRepository;
import BACKEND.Repository.OutfitRepository;

@Service
public class NeuesOutfitService {   //Service wird sich nicht mehr verändern, egal welches Repsitory benutzt wird
    
    private OutfitRepository outfitRepository;
    private KleidungsstueckRepository kleidungsRepository;
    // private Kleidungsstueck aktuellesTshirt;    //kann später benutzt werden um unfertige Outfits im Creator zwischenzuspeichern

    public NeuesOutfitService(OutfitRepository outfitRepository, KleidungsstueckRepository kleidungsRepository) {    //Constructor Injection
        this.outfitRepository = outfitRepository;
        this.kleidungsRepository = kleidungsRepository;
    }


    public Outfit outfitSpeichern(String tshirtBild, String hoseBild, String schuheBild) { 
        //im frontend wird auf speichern gedrückt
        //die drei bilder (und der Name) aus dem creator müssen dem Controller übergeben werden
        //Controller übergibt die Bilder dem Service
        //Service erstellt ein Outfit Objekt und speichert es im Repository
        Tshirt tshirt = new Tshirt(0, tshirtBild, "schwarz", "marke");
        Hose hose = new Hose(0, hoseBild, "blau", "marke");
        Schuhe schuhe = new Schuhe(0, schuheBild, "weiß", "marke");

        Outfit outfit = new Outfit(0, "Outfitname", tshirt, hose, schuhe);
        outfitRepository.outfitSpeichern(outfit);
        return outfit;
    }

    public List<Kleidungsstueck> outfit() {                         //testfunktion
        List<Outfit> outfitListe = outfitRepository.alleOutfitsListe();
        Outfit outfit = outfitListe.get(0);
        Tshirt tshirt = outfit.getTshirt();
        Hose hose = outfit.getHose();
        Schuhe schuhe = outfit.getSchuhe();

        return List.of(tshirt, hose, schuhe);
    }

    public Tshirt nextTshirt() {       //Zufälliges Tshirt aus dem Repository holen
        List<Tshirt> tshirts = kleidungsRepository.alleTshirtsListe();
        System.out.println(tshirts.size());
        int random = (int) (Math.random() * tshirts.size());
        Tshirt tshirt = tshirts.get(random);
        return tshirt;
    }

    public Hose nextHose() {
        List<Hose> hosen = kleidungsRepository.alleHosenListe();
        int random = (int) (Math.random() * hosen.size());
        Hose hose = hosen.get(random);
        return hose;
    }

    public Schuhe nextSchuhe() {
        List<Schuhe> schuhe = kleidungsRepository.alleSchuheListe();
        int random = (int) (Math.random() * schuhe.size());
        Schuhe schuh = schuhe.get(random);
        return schuh;
    }

    public void testBackend(List<Tshirt> l, List<Hose> l2, List<Schuhe> l3) {    //testfunktion um Kleidungsstücke im Repository zu speichern
        for (int i = 0; i < l.size(); i++) {
            kleidungsRepository.tshirtSpeichern(l.get(i));
        }

        for (int i = 0; i < l2.size(); i++) {
            kleidungsRepository.hoseSpeichern(l2.get(i));
        }

        for (int i = 0; i < l3.size(); i++) {
            kleidungsRepository.schuheSpeichern(l3.get(i));
        }
    }

    
    // public Outfit outfitBearbeiten() {
    //     //das wo das fertige outfit in Garderboe ausgewählt wird
    //     //und im creator erscheint und bearbeitet werden kann
    // }

}
