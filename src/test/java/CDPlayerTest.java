import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    CDPlayer cdplayer;

    @Before
    public void setup() {
        cdplayer = new CDPlayer("Sony", "A300", 20);

    }


    @Test
    public void hasMake() {
        assertEquals("Sony", cdplayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("A300", cdplayer.getModel());
    }

    @Test
    public void hasNrCD(){
        assertEquals(20, cdplayer.getNumberOfCD());
    }

    @Test
    public void canPlayCD() {
        assertEquals("I'm Singing!!!", cdplayer.play());
    }

}

