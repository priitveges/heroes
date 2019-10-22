package ee.inbank.heroes.service;

import ee.inbank.heroes.exceptions.HeroNotFoundException;
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
    return heroOp.orElseThrow(HeroNotFoundException::new);
  }

  public Hero save(Hero hero) {
    Hero dbHero = new Hero();
    dbHero.setName(hero.getName());
    dbHero.setStamina(hero.getStamina());
    dbHero.setStrength(hero.getStrength());
    return heroesRepository.save(dbHero);
  }
}
