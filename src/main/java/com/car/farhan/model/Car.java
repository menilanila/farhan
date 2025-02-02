package com.car.farhan.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int carId;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @Column(name = "model")
    private String model;

    @Column(name = "variant")
    private String variant;

    @Column(name = "color")
    private String color;

    @Column(name = "transmission_type")
    private String transmissionType;

    @Column(name = "rental_price_per_day")
    private double rentalPricePerDay;

    @Column(name = "availability_status")
    private boolean availabilityStatus;

    // Getters and Setters


}
