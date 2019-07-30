import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3Test {

    Mp3 mp3;

    @Before
    public void setup() {
        mp3 = new Mp3("Sony", "A300", 25);
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", mp3.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("A300", mp3.getModel());
    }

    @Test
    public void hasStorage() {
        assertEquals(25, mp3.getStorage());
    }
}
