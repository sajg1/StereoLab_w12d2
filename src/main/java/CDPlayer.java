public class CDPlayer extends Component {

    private int numberOfCD;

    CDPlayer(String make, String model, int numberOfCD) {
        super(make, model);
        this.numberOfCD = numberOfCD;
    }

    public int getNumberOfCD() {
        return numberOfCD;
    }

    public String play() {
        return "I'm Singing!!!";
    }
}
