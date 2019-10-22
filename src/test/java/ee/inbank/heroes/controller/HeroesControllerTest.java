package ee.inbank.heroes.controller;

import static org.hibernate.internal.util.collections.CollectionHelper.isNotEmpty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ee.inbank.heroes.model.Hero;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HeroesControllerTest {

  public static final ParameterizedTypeReference<List<Hero>> LIST_OF_HEROES = new ParameterizedTypeReference<List<Hero>>() {
  };
  public static final String PRIIT = "Priit";
  public static final String OLEG = "Oleg";
  public static final String ENN = "Enn";
  @Resource
  private TestRestTemplate template;

  @Test
  public void application_returns_a_list_of_heroes() {
    ResponseEntity<List<Hero>> entity = template.exchange("/heroes", HttpMethod.GET, null, LIST_OF_HEROES);
    assertEquals(HttpStatus.OK, entity.getStatusCode());
    List<Hero> heroes = entity.getBody();
    assertTrue(isNotEmpty(heroes));
    assertTrue(heroes.stream().anyMatch(h -> h.getName().equals(PRIIT)));
    assertTrue(heroes.stream().anyMatch(h -> h.getName().equals(OLEG)));
    assertTrue(heroes.stream().anyMatch(h -> h.getName().equals(ENN)));
  }
}