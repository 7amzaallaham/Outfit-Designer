package BACKEND.Repository;

import java.util.List;

import BACKEND.Model.Outfit;

public interface OutfitRepository {    //SPÄTER extends JpaRepository<Outfit, Long>

    public Outfit outfitSpeichern(Outfit outfit);

    public List<Outfit> alleOutfitsListe();

    // public Outfit idFinden(int id);
}
