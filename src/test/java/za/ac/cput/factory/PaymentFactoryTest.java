package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    void createPayment() {
        Payment payment = PaymentFactory.createPayment(
                "P001",
                "B001",
                500.0,
                LocalDate.now(),
                "Card"
        );

        assertNotNull(payment);
        assertEquals("P001", payment.getPaymentID());
        assertEquals("B001", payment.getBookingID());
        assertEquals(500.0, payment.getAmount());
    }

    @Test
    void createPaymentWithInvalidData() {
        Payment payment = PaymentFactory.createPayment(
                "",
                "B001",
                500.0,
                LocalDate.now(),
                "Card"
        );

        assertNull(payment);
    }
}