package ee.inbank.heroes.service;

import ee.inbank.heroes.model.Hero;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HeroesService {

  public List<Hero> getHeroes() {
    return Arrays.asList(new Hero("Priit", 100, 100),
        new Hero("Oleg", 50, 80));
  }
}
