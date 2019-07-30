import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void setUp() {
        cdPlayer = new CDPlayer("Sony", "A300", 5);
        radio = new Radio("Sony", "A3000");
        stereo = new Stereo(radio, cdPlayer);
    }

    @Test
    public void hasRadio() {
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void hasCDPlayer() {
        assertEquals(cdPlayer, stereo.getCdPlayer());
    }
}
