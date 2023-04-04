package cpan228.finalProject;

import cpan228.finalProject.model.DistributionCentre;
import cpan228.finalProject.model.Item;
import cpan228.finalProject.repository.DistributionCentreRepository;

import cpan228.finalProject.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}
	@Bean
	public CommandLineRunner dataLoader(DistributionCentreRepository repository, ItemRepository itemRepository) {
		return args -> {
			itemRepository.save(new Item("Skirt", 2023, 20000, Item.Brand.GUCCI, 10));

			repository.save(new DistributionCentre("Place 1", "38.55", "-39.78",1));
			repository.save(new DistributionCentre("Place 2", "-79.4855", "98.78",1));


		};
	}
}
