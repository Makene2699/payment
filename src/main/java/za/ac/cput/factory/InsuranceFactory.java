package za.ac.cput.factory;

import za.ac.cput.domain.Insurance;

public class InsuranceFactory {

    public static Insurance createInsurance(String insuranceID, String bookingID,
                                            String type, double dailyPremium) {


        if (insuranceID == null || insuranceID.isEmpty())
            return null;

        if (bookingID == null || bookingID.isEmpty())
            return null;

        if (type == null || type.isEmpty())
            return null;

        if (dailyPremium <= 0)
            return null;

        // Create object
        return new Insurance.Builder()
                .setInsuranceID(insuranceID)
                .setBookingID(bookingID)
                .setType(type)
                .setDailyPremium(dailyPremium)
                .build();
    }
}