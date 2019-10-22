package ee.inbank.heroes.repository;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HeroesRepositoryTest {

  @Autowired
  private HeroesRepository heroesRepository;

  @Test
  public void findHeroByName() {
    heroesRepository.findHeroByName2("Enn");
  }
}