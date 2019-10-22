package ee.inbank.heroes.repository;

import ee.inbank.heroes.model.Hero;
import java.util.List;

public interface HeroesRepositoryCustom {

  List<Hero> findHeroByName2(String name);

}
