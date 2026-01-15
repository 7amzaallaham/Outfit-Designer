package BACKEND.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Primary;
import BACKEND.Model.Outfit;

@Repository
@Primary
public interface OutfitRepository
        extends JpaRepository<Outfit, Integer> {
}
