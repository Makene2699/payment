package za.ac.cput.factory;

import za.ac.cput.domain.Car;

public class CarFactory {
    public static Car createCar(String carID, String make, String model,
                                int year, double dailyRate, String status, int mileage) {
        return new Car.Builder()
                .setCarID(carID)
                .setMake(make)
                .setModel(model)
                .setYear(year)
                .setDailyRate(dailyRate)
                .setStatus(status)
                .setMileage(mileage)
                .build();
    }
}
