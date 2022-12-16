package com.example.bookingservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
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

    public List<Object> getUserAndBookingDetails(String id){
        System.out.println(id);
        List<Object> list = new ArrayList<>();
        Booking booking = bookingRepository.findById(id).get();
        list.add(booking);
        String movieId = booking.getMovieId();
        HashMap<String, String> params = new HashMap<>();
        params.put("movieId", movieId);
        list.add(new RestTemplate().getForEntity(
                "http://localhost:3002/movies/getByMovieId/{movieId}",
                Object.class,params).getBody());
        return list;
    }
}
