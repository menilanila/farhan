package com.car.farhan.repository;

import com.car.farhan.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookingRepository  extends JpaRepository<Booking,Integer> {


}
