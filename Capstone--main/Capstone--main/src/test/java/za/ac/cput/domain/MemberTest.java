package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void testMemberBuilder() {
        // Create a Member using the Builder
        Member member = new Member.Builder()
                .setMemberId("MEM-001")
                .setName("John Doe")
                .setLicenseNumber("LIC123456")
                .setPhoneNumber(821234567)
                .setAccountStatus("Active")
                .build();

        assertNotNull(member);
        assertEquals("MEM-001", member.getMemberId());
        assertEquals("John Doe", member.getName());
        assertEquals("LIC123456", member.getLicenseNumber());
        assertEquals(821234567, member.getPhoneNumber());
        assertEquals("Active", member.getAccountStatus());
    }

    @Test
    void testMemberCopy() {
        // Create an initial Member
        Member originalMember = new Member.Builder()
                .setMemberId("MEM-002")
                .setName("Stephanie Lewu")
                .setLicenseNumber("LIC987654")
                .setPhoneNumber(719876543)
                .setAccountStatus("Pending")
                .build();

        Member copiedMember = new Member.Builder()
                .copy(originalMember)
                .build();

        assertEquals(originalMember.getMemberId(), copiedMember.getMemberId());
        assertEquals(originalMember.getName(), copiedMember.getName());
        assertEquals(originalMember.getLicenseNumber(), copiedMember.getLicenseNumber());
        assertEquals(originalMember.getPhoneNumber(), copiedMember.getPhoneNumber());
        assertEquals(originalMember.getAccountStatus(), copiedMember.getAccountStatus());
    }
}

