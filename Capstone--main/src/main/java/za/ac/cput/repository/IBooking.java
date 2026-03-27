package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.ArrayList;
import java.util.List;

public class IBooking implements BookingRepository{

    private static IBooking repository = null;

    private List<Booking> bookingList;

    private IBooking() {
        bookingList = new ArrayList<>();
    }

    public static IBooking getRepository() {
        if (repository == null) {
            repository = new IBooking();
        }
        return repository;
    }
    @Override
    public Booking create(Booking booking){
        if (booking != null){
            bookingList.add(booking);
            return booking;
        }
        return null;
    }

    @Override
    public Booking read(String id){
        for (Booking booking : bookingList) {
            if(booking.getBookingID().equals(id)){
                return booking;
            }
        }
        return null;
    }

    @Override
    public Booking update(Booking booking){
        Booking oldBooking = read(booking.getBookingID());
        if(oldBooking != null){
            bookingList.remove(oldBooking);
            bookingList.add(booking);
            return booking;
        }
        return null;
    }
    @Override
    public boolean delete(String id){
        Booking booking = read(id);

        if(booking!= null){
            bookingList.remove(booking);
            return true;
        }
        return false;
    }

    @Override
    public List<Booking> getAll() {
        return bookingList;
    }



}
