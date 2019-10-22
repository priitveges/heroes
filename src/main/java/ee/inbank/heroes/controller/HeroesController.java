package ee.inbank.heroes.controller;

import ee.inbank.heroes.dto.Hero;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroesController {

  @GetMapping("/heroes")
  public List<Hero> getHeroes() {
    return Arrays.asList(new Hero("Priit", 100, 100),
        new Hero("Oleg", 50, 80));
  }
}
