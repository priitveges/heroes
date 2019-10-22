package ee.inbank.heroes;

import ee.inbank.heroes.model.Hero;
import ee.inbank.heroes.repository.HeroesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class HeroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroesApplication.class, args);
	}

	@Bean
	public CommandLineRunner initHeroes(HeroesRepository heroesRepository) {
		return (args) -> {
			List<Hero> heroes = Arrays.asList(
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
