package lambdaoptional;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {
    @Test
    void init() {
        Member member = new Member("Jane Doe", Arrays.asList("Cooking", "Washing"), Gender.FEMALE);
        assertEquals("Jane Doe", member.getName());
    }

    @Test
    void testFindFirst() {
        Club club = new Club(Arrays.asList(
                new Member("Jack", Arrays.asList("singing", "dancing"), Gender.MALE),
                new Member("Jane", Arrays.asList("driving"), Gender.FEMALE),
                new Member("Joe", Arrays.asList("laughing", "watching", "telling bad jokes"), Gender.MALE)
        ));

        assertFalse(club.findFirst(m -> m.getName().equals("Jill")).isPresent());
        assertEquals("Jane", club.findFirst(m -> m.getName().equals("Jane")).get().getName());
    }

    @Test
    void testAverage() {
        assertFalse(new Club(Collections.emptyList()).averageNumberOfSkills().isPresent());

        Club club = new Club(Arrays.asList(
                new Member("Jack", Arrays.asList("singing", "dancing"), Gender.MALE),
                new Member("Jane", Arrays.asList("driving"), Gender.FEMALE),
                new Member("Joe", Arrays.asList("laughing", "watching", "telling bad jokes"), Gender.MALE)
        ));
        assertEquals(2, club.averageNumberOfSkills().get());
    }
}