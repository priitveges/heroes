package ee.inbank.heroes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "hero")
public class Hero {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Integer strength;
  private Integer stamina;

  public Hero(String name) {
    this.name = name;
  }

  public Hero(String name, Integer strength, Integer stamina) {
    this.name = name;
    this.strength = strength;
    this.stamina = stamina;
  }
}
