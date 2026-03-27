package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.List;
import java.util.ArrayList;

public class IPaymentRepository implements PaymentRepository {

    private static IPaymentRepository repository = null;

    private List<Payment> paymentList;


    private IPaymentRepository() {
        paymentList = new ArrayList<>();
    }

    public static IPaymentRepository getRepository() {
        if (repository == null) {
            repository = new IPaymentRepository();
        }
        return repository;
    }


    @Override
    public Payment create(Payment payment) {
        if (payment != null) {
            paymentList.add(payment);
            return payment;
        }
        return null;
    }

    @Override
    public Payment read(String id) {
        for (Payment payment : paymentList) {
            if (payment.getPaymentID().equals(id)) {
                return payment;
            }
        }
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        Payment oldPayment = read(payment.getPaymentID());
        if (oldPayment != null) {
            paymentList.remove(oldPayment);
            paymentList.add(payment);
            return payment;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Payment payment = read(id);
        if (payment != null) {
            paymentList.remove(payment);
            return true;
        }
        return false;
    }

    @Override
    public List<Payment> getAll() {
        return paymentList;
    }
}