package com.car.farhan.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.Date;


@Entity
@Data
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "booking_status")
    private String bookingStatus;

    public Booking(int bookingId, Customer customer, Car car, Admin admin, Date startDate, Date endDate, double totalPrice, String bookingStatus) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.car = car;
        this.admin = admin;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
        this.bookingStatus = bookingStatus;
    }

    public Booking() {
    }
}
