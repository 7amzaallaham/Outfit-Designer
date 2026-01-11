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


    public static Outfit outfitSpeichern() {    //Outfitname als Parameter????
        //im frontend wird auf speichern gedrückt
        //die drei bilder und der Name aus dem creator müssen dem Controller übergeben werden
        //der Controller muss die hier dem Service geben
        //Service erstellt ein Outfit Objekt und speichert es im Repository
        return null;
    }

    // public Outfit outfitBearbeiten() {
    //     //das wo das fertige outfit in Garderboe ausgewählt wird
    //     //und im creator erscheint und bearbeitet werden kann
    // }

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

    public void testBackend(List<Tshirt> l) {
        for (int i = 0; i < l.size(); i++) {
            kleidungsRepository.tshirtSpeichern(l.get(i));
        }
    }

}
