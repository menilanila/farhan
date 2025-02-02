package com.car.farhan.controller;

import com.car.farhan.model.Booking;
import com.car.farhan.repository.AdminRepository;
import com.car.farhan.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/booking")
    public List<Booking> getAllbooking() {
        return bookingService.getAllbooking();
    }
    @GetMapping("/booking/{id}")
    public Booking getbookingById(@PathVariable("id") int id) {
        return bookingService.getbookingById(id);
    }
    @PostMapping("/booking")
    public String addbooking(@RequestBody Booking booking) {
        bookingService.addbooking(booking);
        return "added..";
    }
    @PutMapping("/booking")
    public String updatebooking(@RequestBody Booking booking){
        bookingService.updatebooking(booking);
        return "updated..";
    }
    @DeleteMapping("/booking/{id}")
    public String deletebooking(@PathVariable int id){
        bookingService.deletebooking(id);
        return "deleted..";
    }
    @DeleteMapping("/booking/clear")
    public String deleteall(){
        bookingService.deleteall();
        return "deleted booking records";
    }

}
