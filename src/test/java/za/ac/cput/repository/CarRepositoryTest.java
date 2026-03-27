package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;
import za.ac.cput.factory.CarFactory;

import static org.junit.jupiter.api.Assertions.*;

public class CarRepositoryTest {

        @Test
        void testCreateAndRead() {
            ICarRepository repo = new ICarRepository();

            Car car = CarFactory.createCar(
                    "C001", "Toyota", "Corolla",
                    2021, 700.0, "Available", 10000
            );
            repo.create(car);
            Car found = repo.read("C001");

            assertNotNull(found);
            assertEquals("Toyota", found.getMake());
        }
}
