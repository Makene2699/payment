package za.ac.cput.repository;

import za.ac.cput.domain.Branch;

import java.util.ArrayList;
import java.util.List;

public class BranchRepository implements IBranchRepository {

    private static IBranchRepository repository = null;

    private List<Branch> branchList;

    private BranchRepository() {
        branchList = new ArrayList<>();
    }

    public static IBranchRepository getRepository() {
        if (repository == null) {
            repository = new BranchRepository();
            
        }
        return repository;
    }

    @Override
    public Branch create(Branch branch) {
        branchList.add(branch);
        return branch;
    }

    @Override
    public Branch read(Integer id) {
        for (Branch b : branchList) {
            if (b.getBranchID() == id) {
                return b;
            }
        }
        return null;
    }

    @Override
    public Branch update(Branch branch) {
        Branch oldBranch = read(branch.getBranchID());
        if (oldBranch != null) {
            branchList.remove(oldBranch);
            branchList.add(branch);
            return branch;
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        Branch branchToDelete = read(id);
        if (branchToDelete != null) {
            branchList.remove(branchToDelete);
            return true;
        }
        return false;
    }

    @Override
    public List<Branch> getAll() {
        return List.copyOf(branchList);
    }
}