package za.ac.cput.factory;

import za.ac.cput.domain.Branch;

public class BranchFactory {

    public static Branch createBranch(int branchID, String branchName, String address, String city, String managerName) {

        return new Branch.Builder()
                .setBranchID(branchID)
                .setBranchName(branchName)
                .setAddress(address)
                .setCity(city)
                .setManagerName(managerName)
                .build();
    }
}