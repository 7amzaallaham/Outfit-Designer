package BACKEND.Repository;

import java.util.List;
import BACKEND.Model.Hose;
import BACKEND.Model.Schuhe;
import BACKEND.Model.Tshirt;

public interface KleidungsstueckRepository {            //Schlecht wegen DRY???? :(

    public Tshirt tshirtSpeichern(Tshirt tshirt);           //Tshirt
    public List<Tshirt> alleTshirtsListe();
    //idfinden brauchen wir das oder nicht????

    public Hose hoseSpeichern(Hose hose);                  //Hose
    public List<Hose> alleHosenListe();

    public Schuhe schuheSpeichern(Schuhe schuhe);          //Schuhe
    public List<Schuhe> alleSchuheListe();
    
}
