public class Mp3 extends Component {

    private int storage;

    public Mp3(String make, String model, int storage) {
        super(make,model);
        this.storage = storage;
        }

    public int getStorage() {
        return storage;
    }
}
