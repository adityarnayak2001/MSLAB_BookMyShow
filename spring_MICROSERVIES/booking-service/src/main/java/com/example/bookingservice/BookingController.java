package com.example.bookingservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/booking")
@RestController
public class BookingController {
    private BookingService bookingService;
    public BookingController(BookingService bookingService){
        this.bookingService=bookingService;
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
}
