package BACKEND.Repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import BACKEND.Model.Outfit;

@Repository
public class OutfitRepository_LOKAL implements OutfitRepository {

    private List<Outfit> outfits = new ArrayList<>();     //Outfits erstmal in einer Liste gespeichert   ---> Später Datenbank!!!

    @Override
    public Outfit outfitSpeichern(Outfit outfit) {    //wird im creator benutzt
        outfits.add(outfit);
        return outfit;
    }

    @Override
    public List<Outfit> alleOutfitsListe() {      //wird in der Garderobe->Outfits benutzt
        return outfits;
    }
    
}
