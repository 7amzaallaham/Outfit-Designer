package BACKEND.Model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Kleidungsstueck {    //aus dem Klassendiagramm  ---> Tshirt, Hose, Schuhe erweitern die Klasse

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bildpfad;
    private String farbe;
    private String marke;

    protected Kleidungsstueck() {
    }

    public Kleidungsstueck(String bildLink, String farbe, String marke) {
        this.bildpfad = bildLink;
        this.farbe = farbe;
        this.marke = marke;
    }


    public int getId() {
        return id;
    }

    public String getBildpfad() {
        return bildpfad;
    }

    public String getFarbe() {
        return farbe;
    }

    public String getMarke() {
        return marke;
    }
}
