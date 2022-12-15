package com.example.bookingservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private BookingRepository bookingRepository;
    public BookingService(BookingRepository bookingRepository){
        this.bookingRepository=bookingRepository;
    }
    public Booking ticketBooking(Booking booking){
        return bookingRepository.save(booking);
    }
    public List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }
    public Booking getCustomerBooking(String id){
        return bookingRepository.findById(id).orElse(null);
    }
    public String deleteCustomerBooking(String id){
        bookingRepository.deleteById(id);
        return "Booking deleted successfully";
    }
    public Booking updateCustomerBooking(Booking booking,String id){
        Booking booking1 = bookingRepository.findById(id).get();
        booking1.setLanguage(booking.getLanguage());
        booking1.setMovieFormat(booking.getMovieFormat());
        booking1.setSelectedSeats(booking.getSelectedSeats());
        bookingRepository.save(booking1);
        return booking1;
    }
}
