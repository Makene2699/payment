package za.ac.cput.factory;

import org.junit.Test;
import za.ac.cput.domain.Booking;

import static org.junit.Assert.assertNotNull;

public class BookingFactoryTest {
    @Test
    public void buildBooking() {

        Booking booking = BookingFactory.buildBooking(
                "B001",
                "M001",
                "C001",
                "2026-03-18",
                "2026-03-20",
                1500.00
        );

        assertNotNull(booking);
        System.out.println(booking);
    }
}

