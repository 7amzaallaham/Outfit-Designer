package BACKEND.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Primary;
import BACKEND.Model.Kleidungsstueck;

@Repository
@Primary
public interface KleidungsstueckRepository_JPA
        extends JpaRepository<Kleidungsstueck, Integer> {
}
