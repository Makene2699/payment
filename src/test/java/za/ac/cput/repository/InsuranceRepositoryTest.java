package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Insurance;
import za.ac.cput.factory.InsuranceFactory;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceRepositoryTest {

    private IInsuranceRepository repo = IInsuranceRepository.getRepository();

    @Test
    void testCRUD() {

        Insurance insurance = InsuranceFactory.createInsurance(
                "I001", "B001", "Basic", 100.0
        );

        // CREATE
        Insurance created = repo.create(insurance);
        assertNotNull(created);

        // READ
        Insurance read = repo.read("I001");
        assertNotNull(read);

        // UPDATE
        Insurance updated = new Insurance.Builder()
                .setInsuranceID("I001")
                .setBookingID("B001")
                .setType("Full Cover")
                .setDailyPremium(150.0)
                .build();

        repo.update(updated);
        assertEquals("Full Cover", repo.read("I001").getType());

        // DELETE
        boolean deleted = repo.delete("I001");
        assertTrue(deleted);
    }
}