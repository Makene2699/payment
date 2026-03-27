package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PaymentRepositoryTest {

    private static IPaymentRepository repository = IPaymentRepository.getRepository();

    private Payment payment = PaymentFactory.createPayment(
            "P001",
            "B001",
            500.0,
            LocalDate.now(),
            "Card"
    );

    @Test
    void create() {
        Payment created = repository.create(payment);
        assertNotNull(created);
    }

    @Test
    void read() {
        repository.create(payment);
        Payment read = repository.read("P001");

        assertNotNull(read);
    }

    @Test
    void update() {
        repository.create(payment);

        Payment updatedPayment = new Payment.Builder()
                .setPaymentID("P001")
                .setBookingID("B001")
                .setAmount(800.0)
                .setPaymentDate(LocalDate.now())
                .setMethod("Cash")
                .build();

        Payment updated = repository.update(updatedPayment);

        assertNotNull(updated);
        assertEquals(800.0, updated.getAmount());
    }

    @Test
    void delete() {
        repository.create(payment);
        boolean success = repository.delete("P001");

        assertTrue(success);
    }

    @Test
    void getAll() {
        repository.create(payment);
        assertFalse(repository.getAll().isEmpty());
    }
}