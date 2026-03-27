package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;
import za.ac.cput.factory.BookingFactory;

import static org.junit.jupiter.api.Assertions.*;

public class BookingRepositoryTest {

    private IBooking repository = IBooking.getRepository();

    public void create () {
        Booking booking = BookingFactory.buildBooking(
                "B001",
                "M001",
                "C001",
                "2026/03/15",
                "2026/03/20",
                1200.00

        );
        Booking created = repository.create(booking);
        assertNotNull(created);

        System.out.println(created);
    }

    public void read(){
        Booking booking = BookingFactory.buildBooking(
                "B002",
                "M002",
                "C002",
                "2026/04/01",
                "2026/04/04",
                15000.00
        );
        repository.create(booking);

        Booking readBooking = repository.read("B002");
        assertNotNull(readBooking);
        System.out.println(readBooking);
    }



}
