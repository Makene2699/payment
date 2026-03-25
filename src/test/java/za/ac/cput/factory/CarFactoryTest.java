package za.ac.cput.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;

import static org.junit.jupiter.api.Assertions.*;
public class CarFactoryTest {

        @Test
        void testCreateCar() {
            Car car = CarFactory.createCar(
                    "C001", "Toyota", "Corolla",
                    2022, 500.0, "Available", 10000
            );

            assertNotNull(car);
            assertEquals("C001", car.getCarID());
            assertEquals("Toyota", car.getMake());
        }
    }

