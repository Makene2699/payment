package za.ac.cput.factory;

import za.ac.cput.domain.Booking;

public class BookingFactory {
    private BookingFactory() {}

    public static Booking buildBooking(String bookingID,
                                       String memberID, String carID,
                                       String startDate, String endDate,
                                       double totalCost) {
        if (bookingID == null || bookingID.isEmpty())
            return null;

        if (memberID == null || memberID.isEmpty())
            return null;

        if (carID == null || carID.isEmpty())
            return null;

        if (startDate == null || startDate.isEmpty())
            return null;

        if (endDate == null || endDate.isEmpty())
            return null;

        if (totalCost < 0)
            return null;

        return new Booking.Builder()
                .setBookingID(bookingID)
                .setMemberID(memberID)
                .setCarID(carID)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .setTotalCost(totalCost)
                .build();


    }

}


