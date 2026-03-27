package za.ac.cput.repository;

import za.ac.cput.domain.Branch;
import java.util.List;

public interface IBranchRepository extends IRepository<Branch, Integer> {
    List<Branch> getAll();
}