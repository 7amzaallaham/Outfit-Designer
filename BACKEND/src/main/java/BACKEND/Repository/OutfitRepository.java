package BACKEND.Repository;

import java.util.List;
import BACKEND.Model.Outfit;

public interface OutfitRepository {

    public Outfit outfitSpeichern(Outfit outfit);

    public List<Outfit> alleOutfitsListe();

    // public Outfit idFinden(int id);
}
