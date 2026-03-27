package za.ac.cput.factory;

import za.ac.cput.domain.Branch;
import za.ac.cput.factory.BranchFactory;

public class BranchFactoryTest {

    public static void main(String[] args) {

        Branch branch = BranchFactory.createBranch(
                1,
                "Main Branch",
                "143 Bloom Street",
                "Cape Town",
                "Micky"
        );

        System.out.println("Factory Test:");
        System.out.println(branch);

        branch.listAvailableCarsAtBranch();
    }
}