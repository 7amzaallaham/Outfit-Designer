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

    public String[] getFarben() {
        String[] farben = new String[3];
        farben[0] = tshirt.getFarbe();
        farben[1] = hose.getFarbe();
        farben[2] = schuhe.getFarbe();
        return farben;
    }

    public String[] getMarken() {
        String marken[] = new String[3];
        marken[0] = tshirt.getMarke();
        marken[1] = hose.getMarke();
        marken[2] = schuhe.getMarke();
        return marken;
    }


    // public void bearbeiten() {

    // }

    // public void loeschen() {

    // }

    // public void veroeffentlichen() {

    // }
}
