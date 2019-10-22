package ee.inbank.heroes.controller;

import ee.inbank.heroes.model.Hero;
import ee.inbank.heroes.service.HeroesService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroes")
@AllArgsConstructor
public class HeroesController {

  private HeroesService heroesService;

  @GetMapping
  public List<Hero> getHeroes() {
    return heroesService.getHeroes();
  }

  @GetMapping("/{id}")
  public Hero getHero(@PathVariable Long id) {
    return heroesService.getHero(id);
  }

  @PostMapping
  public Hero save(@RequestBody Hero hero) {
    return heroesService.save(hero);
  }
}
