package za.ac.cput.repository;

import za.ac.cput.domain.Car;

import java.util.HashSet;
import java.util.Set;

public class ICarRepository implements CarRepository {

        private Set<Car> cars = new HashSet<>();

        @Override
        public Car create(Car car) {
            cars.add(car);
            return car;
        }

        @Override
        public Car read(String carID) {
            return cars.stream()
                    .filter(c -> c.getCarID().equals(carID))
                    .findAny()
                    .orElse(null);
        }

        @Override
        public Car update(Car car) {
            Car oldCar = read(car.getCarID());
            if (oldCar != null) {
                cars.remove(oldCar);
                cars.add(car);
                return car;
            }
            return null;
        }

        @Override
        public boolean delete(String carID) {
            Car car = read(carID);
            if (car != null) {
                cars.remove(car);
                return true;
            }
            return false;
        }

        @Override
        public Set<Car> getAll() {
            return cars;
        }
}
