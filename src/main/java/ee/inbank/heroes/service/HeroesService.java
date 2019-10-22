package ee.inbank.heroes.service;

import ee.inbank.heroes.model.Hero;
import ee.inbank.heroes.repository.HeroesRepository;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HeroesService {

  private HeroesRepository heroesRepository;

  public List<Hero> getHeroes() {
    return heroesRepository.findAll();
  }
}
