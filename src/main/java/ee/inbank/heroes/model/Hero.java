package ee.inbank.heroes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Hero {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private Integer strength;
  private Integer stamina;

  public Hero(String name, Integer strength, Integer stamina) {
    this.name = name;
    this.strength = strength;
    this.stamina = stamina;
  }
}
