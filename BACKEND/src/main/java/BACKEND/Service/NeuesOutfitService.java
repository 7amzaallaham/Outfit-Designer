package BACKEND.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import BACKEND.Model.Hose;
import BACKEND.Model.Kleidungsstueck;
import BACKEND.Model.Outfit;
import BACKEND.Model.Schuhe;
import BACKEND.Model.Tshirt;
import BACKEND.Repository.KleidungsstueckRepository;
import BACKEND.Repository.KleidungsstueckRepository_JPA;
import BACKEND.Repository.OutfitRepository;
import BACKEND.Repository.OutfitRepository_JPA;

@Service
public class NeuesOutfitService {   //Service wird sich nicht mehr verändern, egal welches Repsitory benutzt wird
    
    private OutfitRepository outfitRepository;
    private KleidungsstueckRepository kleidungsRepository;
    // private OutfitRepository_JPA outfitRepository;
    // private KleidungsstueckRepository_JPA kleidungsRepository;
    // private Kleidungsstueck aktuellesTshirt;    //kann später benutzt werden um unfertige Outfits im Creator zwischenzuspeichern

    public NeuesOutfitService(OutfitRepository outfitRepository, KleidungsstueckRepository kleidungsRepository) {    //LOKALE Datenbank
        this.outfitRepository = outfitRepository;                       //Constructor Injection
        this.kleidungsRepository = kleidungsRepository;
    }

    // public NeuesOutfitService(OutfitRepository_JPA outfitrepo, KleidungsstueckRepository_JPA kleidungsrepo) {      //H2 Datenbank
    //     this.outfitRepository = outfitrepo;                              //Construktor Injection
    //     this.kleidungsRepository = kleidungsrepo;
    // }


    public Outfit outfitSpeichern(String tshirtBild, String hoseBild, String schuheBild) { 
        //im frontend wird auf speichern gedrückt
        //die drei bilder (und der Name) aus dem creator müssen dem Controller übergeben werden
        //Controller übergibt die Bilder dem Service
        //Service erstellt ein Outfit Objekt und speichert es im Repository
        Tshirt tshirt = new Tshirt(tshirtBild, "schwarz", "marke");
        Hose hose = new Hose(hoseBild, "blau", "marke");
        Schuhe schuhe = new Schuhe(schuheBild, "weiß", "marke");

        Outfit outfit = new Outfit("Outfitname", tshirt, hose, schuhe);
        outfitRepository.outfitSpeichern(outfit);                                        //lokal
        // outfitRepository.save(outfit);                                                      //H2
        return outfit;
    }

    public List<Kleidungsstueck> outfit() {                         //testfunktion
        List<Outfit> outfitListe = outfitRepository.alleOutfitsListe();               //lokal
        // List<Outfit> outfitListe = outfitRepository.findAll();                           //H2
        Outfit outfit = outfitListe.get(0);
        Tshirt tshirt = outfit.getTshirt();
        Hose hose = outfit.getHose();
        Schuhe schuhe = outfit.getSchuhe();

        return List.of(tshirt, hose, schuhe);
    }

    public Tshirt nextTshirt() {       //Zufälliges Tshirt aus dem Repository holen
        List<Tshirt> tshirts = kleidungsRepository.alleTshirtsListe();              //lokal
        // List<Tshirt> tshirts = kleidungsRepository.                   //H2
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
