package com.example.products.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/{id}/products/{type}")
public class ProductsController {

    private static final List<Map<String, String>> PRODUCTS = List.of(
        Map.of("id", "11", "name", "Product A", "type", "electronics"),
        Map.of("id", "22", "name", "Product B", "type", "furniture"),
        Map.of("id", "22/A", "name", "Product B", "type", "furniture")
    );

    @GetMapping("/list")
    public Map<String, Object> getProductsList(@PathVariable String id, @PathVariable String type) {
        List<Map<String, String>> filteredProducts = PRODUCTS.stream()
            .filter(product -> product.get("id").equals(id))
            .collect(Collectors.toList());

        return Map.of("id", id, "type", type, "products", filteredProducts);
    }
}
