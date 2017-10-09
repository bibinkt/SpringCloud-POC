package com.product.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.product.model.ProductDetail;

@RestController
public class ProductService {

    @RequestMapping("/product/{productId}")
    public ProductDetail getProduct(@PathVariable int productId) {

        return new ProductDetail(productId, "Sofa Set", "Leopard-Print Sofa Jewelry Box");
    }
}
