package com.example.bookingservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@RequestMapping("/booking")
@RestController
public class BookingController {
    private BookingService bookingService;
    private final BookingRepository bookingRepository;

    public BookingController(BookingService bookingService,
                             BookingRepository bookingRepository){
        this.bookingService=bookingService;
        this.bookingRepository = bookingRepository;
    }
    @GetMapping("/getAllBookings")
    public List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }
    @GetMapping("/getBooking/{id}")
    public Booking getBooking(@PathVariable String id){
        return bookingService.getCustomerBooking(id);
    }
    @PostMapping("/ticketBooking")
    public Booking createBooking(@RequestBody Booking booking){
        return bookingService.ticketBooking(booking);
    }
    @DeleteMapping("/cancelBooking/{id}")
    public String deleteBooking(@PathVariable String id){
        return bookingService.deleteCustomerBooking(id);
    }
    @GetMapping("/getUserAndBookingOption/{id}")
    public List<Object> getUserAndBookingOption(@PathVariable String id){
        return bookingService.getUserAndBookingDetails(id);
    }
}
