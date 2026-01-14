package BACKEND.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.context.annotation.Primary;

import BACKEND.Model.Hose;
import BACKEND.Model.Kleidungsstueck;
import BACKEND.Model.Schuhe;
import BACKEND.Model.Tshirt;

@Repository
@Primary
public interface KleidungsstueckRepository_JPA
        extends JpaRepository<Kleidungsstueck, Integer> {

    @Query("select t from Tshirt t")
    List<Tshirt> alleTshirtsListe();

    @Query("select h from Hose h")
    List<Hose> alleHosenListe();

    @Query("select s from Schuhe s")
    List<Schuhe> alleSchuheListe();
}
