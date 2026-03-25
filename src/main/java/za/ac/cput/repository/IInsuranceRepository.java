package za.ac.cput.repository;

import za.ac.cput.domain.Insurance;
import java.util.ArrayList;
import java.util.List;

public class IInsuranceRepository implements InsuranceRepository {

    private static IInsuranceRepository repository = null;
    private List<Insurance> insuranceList;

    private IInsuranceRepository() {
        insuranceList = new ArrayList<>();
    }

    public static IInsuranceRepository getRepository() {
        if (repository == null) {
            repository = new IInsuranceRepository();
        }
        return repository;
    }

    @Override
    public Insurance create(Insurance insurance) {
        if (insurance != null) {
            insuranceList.add(insurance);
            return insurance;
        }
        return null;
    }

    @Override
    public Insurance read(String id) {
        for (Insurance insurance : insuranceList) {
            if (insurance.getInsuranceID().equals(id)) {
                return insurance;
            }
        }
        return null;
    }

    @Override
    public Insurance update(Insurance insurance) {
        Insurance oldInsurance = read(insurance.getInsuranceID());
        if (oldInsurance != null) {
            insuranceList.remove(oldInsurance);
            insuranceList.add(insurance);
            return insurance;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Insurance insurance = read(id);
        if (insurance != null) {
            insuranceList.remove(insurance);
            return true;
        }
        return false;
    }

    @Override
    public List<Insurance> getAll() {
        return insuranceList;
    }
}