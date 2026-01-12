package BACKEND.Model;

import jakarta.persistence.*;

@Entity

public class Tshirt extends Kleidungsstueck {

    protected Tshirt() {

        //JPA

    }

    public Tshirt(int id, String bildLink, String farbe, String marke) {
        super(id, bildLink, farbe, marke);
    }
}
