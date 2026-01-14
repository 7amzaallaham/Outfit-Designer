package BACKEND.Model;
import jakarta.persistence.*;

@Entity
public class Outfit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String outfitName;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Tshirt tshirt;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Hose hose;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Schuhe schuhe;

    protected Outfit() {

        //JPA db

    }

    public Outfit(String name, Tshirt tshirt, Hose hose, Schuhe schuhe) {     //id wird automatisch generiert
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


    public String[] getFarben() {                 //Funktionen für die Filterfunktion (Gerade nicht in Verwendung)
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
