package BACKEND.Repository;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import BACKEND.Model.Outfit;

@Repository

public class OutfitRepository_LOKAL implements OutfitRepository {

    private List<Outfit> outfits = new ArrayList<>();

    // wird vom Creator benutzt
    @Override
    public Outfit outfitSpeichern(Outfit outfit) {
        outfits.add(outfit);
        return outfit;
    }
    
    // wird von der Garderobe benutzt
    @Override
    public List<Outfit> alleOutfitsListe() {
        return outfits;
    }
}
