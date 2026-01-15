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

    private final OutfitRepository outfitRepository;
    private final KleidungsstueckRepository kleidungsstueckRepository;


    public GarderobeService(
            OutfitRepository outfitRepository,
            KleidungsstueckRepository kleidungsstueckRepository) {
        this.outfitRepository = outfitRepository;
        this.kleidungsstueckRepository = kleidungsstueckRepository;
    }

    public List<Outfit> getOutfits() {
        return outfitRepository.findAll();
    }

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
