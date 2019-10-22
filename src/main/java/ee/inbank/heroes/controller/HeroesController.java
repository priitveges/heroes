package ee.inbank.heroes.controller;

import ee.inbank.heroes.model.Hero;
import ee.inbank.heroes.service.HeroesService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HeroesController {

  private HeroesService heroesService;

  @GetMapping("/heroes")
  public List<Hero> getHeroes() {
    return heroesService.getHeroes();
  }

  @GetMapping("/heroes/{id}")
  public Hero getHero(@PathVariable Long id) {
    return heroesService.getHero(id);
  }
}
