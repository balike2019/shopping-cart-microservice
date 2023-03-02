package com.balikeOnline.ProductService.dto;

import lombok.*;

import java.math.BigDecimal;
@Setter
@Getter
@Data
@Builder
public class ProductRequest {
    private String ProductName;
    private String description;
    private BigDecimal price;
    private Long quantity;



}
