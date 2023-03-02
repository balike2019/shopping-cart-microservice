package com.balikeOnline.ProductService.controller;

import com.balikeOnline.ProductService.dto.ProductRequest;
import com.balikeOnline.ProductService.dto.ProductResponse;
import com.balikeOnline.ProductService.service.ProductService;
import com.balikeOnline.ProductService.service.ProductServiceImple;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
@Log4j2
public class ProductController {
    @Autowired
    private final ProductServiceImple productServiceImple;
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
    productServiceImple.createProduct(productRequest);
}
@GetMapping("v2/api-docs")
@ResponseStatus(HttpStatus.OK)
public List<ProductResponse> getAllProduct(){

return productServiceImple.getAllProducts();

    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable("id") long productId) {

        log.info("ProductController | getProductById is called");

        log.info("ProductController | getProductById | productId : " + productId);

        ProductResponse productResponse
                = productServiceImple.getProductById(productId);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }


    @PutMapping("/reduceQuantity/{id}")
    public ResponseEntity<Void> reduceQuantity(
            @PathVariable("id") long productId,
            @RequestParam long quantity
    ) {

        log.info("ProductController | reduceQuantity is called");

        log.info("ProductController | reduceQuantity | productId : " + productId);
        log.info("ProductController | reduceQuantity | quantity : " + quantity);

        productServiceImple.reduceQuantity(productId,quantity);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") long productId) {
        productServiceImple.deleteProductById(productId);
    }





    }

