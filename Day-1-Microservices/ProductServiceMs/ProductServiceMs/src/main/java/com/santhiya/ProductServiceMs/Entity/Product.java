package com.santhiya.ProductServiceMs.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long productId;

    @Column(name="PRODUCT_NAME")
    private String productName;

    @Column(name="PRICE")
    private long price;

    @Column(name="QUANTITY")
    private long quantity;
}

