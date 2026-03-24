package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import java.time.LocalDate;

public class PaymentFactory {

    public static Payment createPayment(String paymentID, String bookingID,
                                        double amount, LocalDate paymentDate,
                                        String method) {

        // Validation (VERY IMPORTANT FOR MARKS)
        if (paymentID == null || paymentID.isEmpty())
            return null;

        if (bookingID == null || bookingID.isEmpty())
            return null;

        if (amount <= 0)
            return null;

        if (paymentDate == null)
            return null;

        if (method == null || method.isEmpty())
            return null;

        // Create object using Builder
        return new Payment.Builder()
                .setPaymentID(paymentID)
                .setBookingID(bookingID)
                .setAmount(amount)
                .setPaymentDate(paymentDate)
                .setMethod(method)
                .build();
    }
}