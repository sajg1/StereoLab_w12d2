import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    CDPlayer cdplayer;

    @Before
    public void setup() {
        cdplayer = new CDPlayer("Sony", "A300");

    }


    @Test
    public void hasMake() {
        assertEquals("Sony", cdplayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("A300", cdplayer.getModel());
    }
}

