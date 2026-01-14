package BACKEND.Model;

import jakarta.persistence.*;

@Entity

public class Tshirt extends Kleidungsstueck {

    protected Tshirt() {

        //JPA

    }

    public Tshirt(String bildLink, String farbe, String marke) {
        super(bildLink, farbe, marke);
    }
}
