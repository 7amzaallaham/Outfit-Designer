package BACKEND.Model;

import jakarta.persistence.Entity;

@Entity
public class Hose extends Kleidungsstueck {

    protected Hose() {
        // JPA 
    }

    public Hose(String bildLink, String farbe, String marke) {
        super(bildLink, farbe, marke);
    }
}
