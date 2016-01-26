/**
 * Created by Iryna_Busel on 1/22/2016.
 */
public class SemiPreciousStone extends Stone {

    public SemiPreciousStone(Stone stone) {
        super(stone.name, stone.weight, stone.transparency, stone.cost);
    }

    @Override
    public String toString() {
        return super.toString() + " (semiprecious)";
    }
}
