package BACKEND.Model;

import jakarta.persistence.Entity;

@Entity
public class Hose extends Kleidungsstueck {

    protected Hose() {
        // JPA 
    }

    public Hose(int id, String bildLink, String farbe, String marke) {
        super(id, bildLink, farbe, marke);
    }
}
