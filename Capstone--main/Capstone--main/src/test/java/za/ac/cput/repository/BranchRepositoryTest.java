package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Branch;
import za.ac.cput.factory.BranchFactory;
import za.ac.cput.repository.BranchRepository;
import za.ac.cput.repository.IBranchRepository;

import static org.junit.jupiter.api.Assertions.*;

class BranchRepositoryTest {

    IBranchRepository repo = BranchRepository.getRepository();

    @Test
    void testCRUD() {

        // CREATE
        Branch branch = BranchFactory.createBranch(
                1, "Main Branch", "143 Bloom Street", "Cape Town", "Micky"
        );

        Branch created = repo.create(branch);
        assertNotNull(created);

        // READ
        Branch read = repo.read(1);
        assertNotNull(read);

        // UPDATE
        Branch updated = new Branch.Builder()
                .setBranchID(1)
                .setBranchName("Updated Branch")
                .setAddress("143 Street")
                .setCity("Cape Town")
                .setManagerName("Micky")
                .build();

        repo.update(updated);
        assertEquals("Updated Branch", repo.read(1).getBranchName());

        // DELETE
        boolean deleted = repo.delete(1);
        assertTrue(deleted);
    }
}