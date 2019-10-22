package ee.inbank.heroes.repository;

import ee.inbank.heroes.model.Hero;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroesRepository extends JpaRepository<Hero, Long>, HeroesRepositoryCustom {

  List<Hero> findAllByOrderByIdAsc();
  List<Hero> findHeroByName(String name);
}
