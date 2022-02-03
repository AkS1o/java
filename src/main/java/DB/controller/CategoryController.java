package DB.controller;

import DB.entities.Category;
import DB.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories/")
public class CategoryController {
    private final CategoryRepository categoryRepository;

    @GetMapping("/{id}")
    public Category getById(@PathVariable("id") int id) {
        return categoryRepository.findById(id).get();
    }

    @PostMapping("")
    public Category create (Category сategory) {
        return categoryRepository.save(сategory);
    }

    @PutMapping("")
    public Category update (Category сategory) {
        return categoryRepository.save(сategory);
    }

    @DeleteMapping("/{id}")
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }
}
