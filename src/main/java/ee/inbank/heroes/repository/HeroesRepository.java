package ee.inbank.heroes.repository;

import ee.inbank.heroes.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroesRepository extends JpaRepository<Hero, Long> {
}
