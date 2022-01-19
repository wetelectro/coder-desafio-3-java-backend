package coder.wetagustin.desafio3.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/api/productos")
    public Object getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/api/productos/{id}")
    public Object getProductById( @PathVariable int id ) {
        return productService.getProduct(id);
    }

    @PostMapping("/api/productos")
    public Object createProduct( @RequestBody Product product ){
        return productService.createProduct( product );
    }
}
