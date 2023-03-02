package com.balikeOnline.ProductService.service;

import com.balikeOnline.ProductService.dto.ProductRequest;
import com.balikeOnline.ProductService.dto.ProductResponse;
import com.balikeOnline.ProductService.model.Product;
import com.balikeOnline.ProductService.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


public interface ProductService  {
    //private final ProductRepository productRepository;
   // @Autowired
   // private ModelMapper modelMapper ;


    public void createProduct(ProductRequest productRequest); //{
       // Product product = Product.builder()
               // .productId(productRequest.getProductId())
                //.ProductName(productRequest.getProductName())
                //.description(productRequest.getDescription())
                //.price(productRequest.getPrice())
                //.build();
        //productRepository.save(product);
        //log.info("product {} is saved",product.getProductId());
    //}
  public List<ProductResponse> getAllProducts();//{
      //List<Product> products=productRepository.findAll();
   // return   products.stream().map(this::mapToProductResponse).collect(Collectors.toList());

    /*spring.datasource.url=jdbc:mysql://localhost:3306/productApp
    spring.datasource.username=root
    spring.datasource.password=pvi@2021
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

    spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER
*/ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);

    public void deleteProductById(long productId);



    public ProductResponse mapToProductResponse(Product product); //{
       /* return  ProductResponse.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

        */
    }
