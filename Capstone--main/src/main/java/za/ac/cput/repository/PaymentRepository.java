package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.List;

public interface PaymentRepository extends IRepository<Payment, String> {
    List<Payment> getAll();
}
