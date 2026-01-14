package BACKEND.Repository;

import java.util.ArrayList;
import java.util.List;
// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import BACKEND.Model.Hose;
import BACKEND.Model.Schuhe;
import BACKEND.Model.Tshirt;

@Repository

public class KleidungsstueckRepository_LOKAL implements KleidungsstueckRepository {

    private List<Tshirt> tshirts = new ArrayList<>();
    private List<Hose> hosen = new ArrayList<>();
    private List<Schuhe> schuhe = new ArrayList<>();

    @Override
    public Tshirt tshirtSpeichern(Tshirt tshirt) {
        tshirts.add(tshirt);
        return tshirt;
    }

    @Override
    public List<Tshirt> alleTshirtsListe() {
        return tshirts;
    }

    @Override
    public Hose hoseSpeichern(Hose hose) {
        hosen.add(hose);
        return hose;
    }

    @Override
    public List<Hose> alleHosenListe() {
        return hosen;
    }

    @Override
    public Schuhe schuheSpeichern(Schuhe schuhe) {
        this.schuhe.add(schuhe);
        return schuhe;
    }

    @Override
    public List<Schuhe> alleSchuheListe() {
        return schuhe;
    }
}
