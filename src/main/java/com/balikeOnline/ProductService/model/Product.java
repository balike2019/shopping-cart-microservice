package com.balikeOnline.ProductService.model;

import lombok.*;

import javax.persistence.*;
import java.lang.annotation.Documented;
import java.math.BigDecimal;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    @Column(name="product_Name")
    private String ProductName;
    @Column(name="description")
    private String description;
@Column(name="price")
    private BigDecimal price;
@Column(name="Quantity")
private Long quantity;
}
