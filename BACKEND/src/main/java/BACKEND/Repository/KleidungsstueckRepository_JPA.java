package BACKEND.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import BACKEND.Model.Kleidungsstueck;

public interface KleidungsstueckRepository_JPA
        extends JpaRepository<Kleidungsstueck, Integer> {
}
