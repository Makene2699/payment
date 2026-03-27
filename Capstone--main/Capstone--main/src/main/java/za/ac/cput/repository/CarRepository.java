package za.ac.cput.repository;

import za.ac.cput.domain.Car;

import java.util.Set;

public interface CarRepository extends IRepository<Car, String>{

    Set<Car> getAll();
}
