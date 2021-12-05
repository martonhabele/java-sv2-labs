package staticattrmeth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VetTest {
    @Test
    void testAddDog() {
        Vet vet = new Vet();
        vet.addDog(new Dog("Skittles", 3, Species.BEAGLE));
        vet.addDog(new Dog("Bonnie", 12, Species.POINTER));
        vet.addDog(new Dog("Spot", 5, Species.LABRADOR));

        Vet vet1 = new Vet();
        vet1.addDog(new Dog("Guy", 6, Species.GERMAN_SHEPHERD));
        vet1.addDog(new Dog("Q", 7, Species.MIXTURE));

        long number = vet1.getDogList().get(1).getCodeNumber();
        assertEquals(5, number);
    }
}