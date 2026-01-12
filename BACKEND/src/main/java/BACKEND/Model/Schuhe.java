package BACKEND.Model;

import jakarta.persistence.Entity;

@Entity
public class Schuhe extends Kleidungsstueck {

    protected Schuhe() {
        // JPA braucht einen No-Args Constructor
    }

    public Schuhe(int id, String bildLink, String farbe, String marke) {
        super(id, bildLink, farbe, marke);
    }
}
