package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {
    @Test
    public void testGentleman() {
        //Given
        Gentleman gentleman = new Gentleman(null);

        //When
        String name = gentleman.getName();

        //Then
        assertThat(name, equalTo(null));
    }
}