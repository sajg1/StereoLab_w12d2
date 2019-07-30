public class Stereo {

    private String name;
    private Radio radio;
    private CDPlayer cdPlayer;

    public Stereo(String name, Radio radio, CDPlayer cdPlayer) {
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Radio getRadio() {
        return radio;
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }
}
