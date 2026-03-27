package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Insurance;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceFactoryTest {

    @Test
    void createInsurance() {
        Insurance insurance = InsuranceFactory.createInsurance(
                "I001", "B001", "Full Cover", 150.0
        );

        assertNotNull(insurance);
        assertEquals("I001", insurance.getInsuranceID());
    }
}