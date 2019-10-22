package ee.inbank.heroes.service;

import ee.inbank.heroes.model.Hero;
import ee.inbank.heroes.repository.HeroesRepository;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PriitService {

  private HeroesRepository heroesRepository;

  @Scheduled(fixedRate = 1000)
  public void whatDoWeDo(){
    for (Hero hero : heroesRepository.findHeroByName2("Priit")) {
      hero.setStrength(hero.getStrength() + 100);
      heroesRepository.save(hero);
    }

    for (Hero hero : heroesRepository.findHeroByName2("Enn")) {
      hero.setStamina(hero.getStamina() + 200);
      heroesRepository.save(hero);
    }
  }
}
