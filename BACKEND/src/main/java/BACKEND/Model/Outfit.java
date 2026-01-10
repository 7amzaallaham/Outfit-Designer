package BACKEND.Model;

public class Outfit {
    
    private int id;
    private String outfitName;
    private Tshirt tshirt;
    private Hose hose;
    private Schuhe schuhe;

    public Outfit(int id, String name, Tshirt tshirt, Hose hose, Schuhe schuhe) {
        this.id = id;
        this.outfitName = name;
        this.tshirt = tshirt;
        this.hose = hose;
        this.schuhe = schuhe;
    }


    public int getId() {
        return id;
    }

    public String getOutfitName() {
        return outfitName;
    }

    public Tshirt getTshirt() {
        return tshirt;
    }

    public Hose getHose() {
        return hose;
    }

    public Schuhe getSchuhe() {
        return schuhe;
    }


    // public void bearbeiten() {

    // }

    // public void loeschen() {

    // }

    // public void veroeffentlichen() {

    // }
}
