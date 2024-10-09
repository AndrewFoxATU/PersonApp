package ie.atu.personapp;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    List<Product> productList = new ArrayList<>();

    @GetMapping("/getProducts")
    public List<Product> getProducts()
    {
        return productList;
    }
@PostMapping("/addProduct")
    public List<Product> addProduct(@Valid @RequestBody Product product)
    {
        productList.add(product);
        return productList;
    }
}
