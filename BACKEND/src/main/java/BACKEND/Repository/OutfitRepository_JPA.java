package BACKEND.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import BACKEND.Model.Outfit;

public interface OutfitRepository_JPA
        extends JpaRepository<Outfit, Integer> {
}
