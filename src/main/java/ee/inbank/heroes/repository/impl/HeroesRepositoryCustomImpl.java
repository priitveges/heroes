package ee.inbank.heroes.repository.impl;

import ee.inbank.heroes.model.Hero;
import ee.inbank.heroes.repository.HeroesRepositoryCustom;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class HeroesRepositoryCustomImpl implements HeroesRepositoryCustom {

  @PersistenceContext
  private EntityManager entityManager;


  @Override
  public List<Hero> findHeroByName2(String name) {
    List<Hero> query = entityManager.createQuery(""
        + "select h from Hero h "
        + "where h.name = :name")
        .setParameter("name", name)
        .getResultList();

    entityManager.createNativeQuery(""
        + "select * "
        + "from Hero h "
        + "where h.name = :name", Hero.class)
        .setParameter("name", name)
        .getResultList();
    return query;
  }
}
