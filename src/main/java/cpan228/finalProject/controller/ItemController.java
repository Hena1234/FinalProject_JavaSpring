package cpan228.finalProject.controller;

import cpan228.finalProject.model.DistributionCentre;
import cpan228.finalProject.model.Item;
import cpan228.finalProject.model.dto.CreateItem;
import cpan228.finalProject.repository.DistributionCentreRepository;
import cpan228.finalProject.repository.ItemRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemRepository itemRepository;
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    @GetMapping
    public Iterable<Item> allItems() {
        return itemRepository.findAll();
    }

    @PostMapping
    public Item createItem(@Valid @RequestBody CreateItem item) {
       return itemRepository.save(item.toItem());
    }


}