package com.saleshub.web; import com.saleshub.repository.ProductRepository; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/v1/products") public class ProductController { private final ProductRepository repo; public ProductController(ProductRepository r){repo=r;} @GetMapping public Object all(){return repo.findAll();} }
