package BACKEND.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import BACKEND.Model.Hose;
import BACKEND.Model.Outfit;
import BACKEND.Model.Schuhe;
import BACKEND.Model.Tshirt;
import BACKEND.Repository.KleidungsstueckRepository;
import BACKEND.Repository.OutfitRepository;

@Service
public class NeuesOutfitService {
    
    private OutfitRepository outfitRepository;
    private KleidungsstueckRepository kleidungsRepository;

    public NeuesOutfitService(OutfitRepository outfitrepo, KleidungsstueckRepository kleidungsrepo) {      //H2 Datenbank
        this.outfitRepository = outfitrepo;
        this.kleidungsRepository = kleidungsrepo;
    }



    public Outfit outfitSpeichern(String tshirtBild, String hoseBild, String schuheBild) { 
        Tshirt tshirt = new Tshirt(tshirtBild, "schwarz", "marke");
        Hose hose = new Hose(hoseBild, "blau", "marke");
        Schuhe schuhe = new Schuhe(schuheBild, "weiß", "marke");

        Outfit outfit = new Outfit("Outfitname", tshirt, hose, schuhe);
        outfitRepository.save(outfit);
        return outfit;
    }



    public Tshirt nextTshirt() {       //Zufälliges Tshirt aus dem Repository holen
        List<Tshirt> tshirts = kleidungsRepository.alleTshirtsListe();
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


    ////////////////////////////////////////////////////////////////////////// TESTS

    public void testBackend(List<Tshirt> l, List<Hose> l2, List<Schuhe> l3) {    //testfunktion um Kleidungsstücke im Repository zu speichern
        for (int i = 0; i < l.size(); i++) {
            kleidungsRepository.save(l.get(i));
        }

        for (int i = 0; i < l2.size(); i++) {
            kleidungsRepository.save(l2.get(i));
        }

        for (int i = 0; i < l3.size(); i++) {
            kleidungsRepository.save(l3.get(i));
        }
    }
}
