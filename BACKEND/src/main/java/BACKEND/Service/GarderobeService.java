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
public class GarderobeService {
    // Zugriff auf gespeicherte Outfits und auf Tshirts / Hosen / Schuhe
    private final OutfitRepository outfitRepository;
    private final KleidungsstueckRepository kleidungsstueckRepository;

    // // Spring gibt hier automatisch die richtigen Repositories rein
    public GarderobeService(
            OutfitRepository outfitRepository,
            KleidungsstueckRepository kleidungsstueckRepository) {
        this.outfitRepository = outfitRepository;
        this.kleidungsstueckRepository = kleidungsstueckRepository;
    }

    // Holt alle Outfits aus dem Repository (die im Creator erstellt wurden)
    public List<Outfit> getOutfits() {
        return outfitRepository.alleOutfitsListe();
    }
    // Holt alle Tshirts aus der Datenbank
    public List<Tshirt> getTshirts() {
        return kleidungsstueckRepository.alleTshirtsListe();
    }
    
    public List<Hose> getHosen() {
        return kleidungsstueckRepository.alleHosenListe();
    }

    public List<Schuhe> getSchuhe() {
        return kleidungsstueckRepository.alleSchuheListe();
    }
}
