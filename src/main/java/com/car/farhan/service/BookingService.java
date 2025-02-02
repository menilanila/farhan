package com.car.farhan.service;

import com.car.farhan.model.Booking;
import com.car.farhan.repository.AdminRepository;
import com.car.farhan.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public List<Booking> getAllbooking() {
        return bookingRepository.findAll();
    }

    public Booking getbookingById(int id) {
        return bookingRepository.findById(id).orElse(new Booking());
    }

    public void addbooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public void updatebooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public void deletebooking(int id) {
        bookingRepository.deleteById(id);
    }

    public void deleteall() {
        bookingRepository.deleteAll();
    }
}
