package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    Family family;

    @BeforeEach
    void init() {
        family = new Family();
        family.addFamilyMember(new FamilyMember("András", 15));
        family.addFamilyMember(new FamilyMember("András", 20));
        family.addFamilyMember(new FamilyMember("Béla", 25));
        family.addFamilyMember(new FamilyMember("Géza", 30));
    }

    @Test
    void testGetTheAgesOfSelectedMembers() {
        assertEquals(2, family.getFamilyMemberAge("András").size());
        assertTrue(family.getFamilyMemberAge("Béla").contains(25));
    }
}