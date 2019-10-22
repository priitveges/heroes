package ee.inbank.heroes;

import ee.inbank.heroes.model.Hero;
import ee.inbank.heroes.repository.HeroesRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HeroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroesApplication.class, args);
	}

	@Bean
	public CommandLineRunner initHeroes(HeroesRepository heroesRepository) {
		return (args) -> {
			List<Hero> heroes = Arrays.asList(
					new Hero("Priit", 100, 100),
					new Hero("Oleg", 50, 80),
					new Hero("Enn", 99, 200),
					new Hero("Superman"),
					new Hero("Batman"),
					new Hero("Wonder Woman"),
					new Hero("Spider-Man"),
					new Hero("Wolverine"),
					new Hero("Thor"),
					new Hero("Black Widow"),
					new Hero("Captain Marvel"),
					new Hero("Wasp"),
					new Hero("Hulk")
			);
			heroesRepository.saveAll(heroes);
		};
	}
}
