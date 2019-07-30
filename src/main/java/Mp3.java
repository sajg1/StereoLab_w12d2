public class Mp3 extends Component implements IConnect {

    private int storage;

    public Mp3(String make, String model, int storage) {
        super(make,model);
        this.storage = storage;
        }

    public int getStorage() {
        return storage;
    }

    public String connect(Stereo stereo) {
        return "Connected to " + stereo.getName();
    }
}
