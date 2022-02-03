package DB.controller;

import DB.entities.Product;
import DB.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products/")
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping("/{id}")
    public Product getById(@PathVariable("id") int id) {
        return productRepository.findById(id).get();
    }

    @PostMapping("")
    public Product create (Product product) {
        return productRepository.save(product);
    }

    @PutMapping("")
    public Product update (Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(int id) {
        productRepository.deleteById(id);
    }
}
