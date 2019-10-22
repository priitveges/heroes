package ee.inbank.heroes.repository;

import ee.inbank.heroes.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroesRepository extends JpaRepository<Hero, Long> {

}
