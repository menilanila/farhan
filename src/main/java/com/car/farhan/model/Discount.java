package com.car.farhan.model;

import jakarta.persistence.*;

@Entity
@Table(name = "discounts")
public class Discount {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "discount_id")
    private int discountId;

    @Column(name = "code")
    private String code;

    @Column(name = "percentage")
    private double percentage;


}
