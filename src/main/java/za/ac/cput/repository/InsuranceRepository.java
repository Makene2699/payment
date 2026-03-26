package za.ac.cput.repository;

import za.ac.cput.domain.Insurance;
import java.util.List;

public interface InsuranceRepository extends IRepository<Insurance, String> {
    List<Insurance> getAll();
}
