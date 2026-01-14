package BACKEND.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import BACKEND.Model.Hose;
import BACKEND.Model.Outfit;
import BACKEND.Model.Schuhe;
import BACKEND.Model.Tshirt;
import BACKEND.Repository.KleidungsstueckRepository_JPA;
import BACKEND.Repository.OutfitRepository_JPA;

@Service
public class GarderobeService {
    // Zugriff auf gespeicherte Outfits und auf Tshirts / Hosen / Schuhe
    private final OutfitRepository_JPA outfitRepository;
    private final KleidungsstueckRepository_JPA kleidungsstueckRepository;

    // // Spring gibt hier automatisch die richtigen Repositories rein
    public GarderobeService(
            OutfitRepository_JPA outfitRepository,
            KleidungsstueckRepository_JPA kleidungsstueckRepository) {
        this.outfitRepository = outfitRepository;
        this.kleidungsstueckRepository = kleidungsstueckRepository;
    }

    // Holt alle Outfits aus dem Repository (die im Creator erstellt wurden)
    public List<Outfit> getOutfits() {
        return outfitRepository.findAll();
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
