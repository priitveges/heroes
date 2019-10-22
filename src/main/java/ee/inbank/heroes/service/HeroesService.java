package ee.inbank.heroes.service;

import ee.inbank.heroes.model.Hero;
import ee.inbank.heroes.repository.HeroesRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HeroesService {

  private HeroesRepository heroesRepository;

  public List<Hero> getHeroes() {
    return heroesRepository.findAll();
  }

  public Hero getHero(Long id) {
    Optional<Hero> heroOp = heroesRepository.findById(id);
    return heroOp.orElseThrow(RuntimeException::new);
  }
}
