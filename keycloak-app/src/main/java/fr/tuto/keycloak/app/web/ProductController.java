package fr.tuto.keycloak.app.web;

import fr.tuto.keycloak.app.modele.Product;
import fr.tuto.keycloak.app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts() {
       return productService.getProducts();
    }


}
