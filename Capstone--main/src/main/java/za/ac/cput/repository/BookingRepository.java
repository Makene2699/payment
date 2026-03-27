package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.List;

public interface BookingRepository extends IRepository<Booking, String> {
    List<Booking> getAll();


}
