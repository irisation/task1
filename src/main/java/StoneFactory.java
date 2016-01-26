import java.util.Arrays;
import java.util.List;

/**
 * Created by Iryna_Busel on 1/22/2016.
 */
public class StoneFactory {

    public static Stone getStone(Stone stone) {
        if (PreciousStonesNames.getNames().contains(stone.name))
            return new PreciousStone(stone);
        if (SemiPreciousStonesNames.getNames().contains(stone.name))
            return new SemiPreciousStone(stone);
        return null;


    }

    enum PreciousStonesNames {
        Diamond("Diamond"), Sapphire("Sapphire");
        private String name;
        PreciousStonesNames(String name) {
            this.name = name;
        }
        public static List<String> getNames(){
            return Arrays.asList(Diamond.getName(), Sapphire.getName());
        }
        public String getName(){
            return name;
        }
    }

    enum SemiPreciousStonesNames {Amber("Amber"), Turquoise("Turquoise");
        private String name;
        SemiPreciousStonesNames(String name) {
            this.name = name;
        }
        public static List<String> getNames(){
            return Arrays.asList(Amber.getName(), Turquoise.getName());
        }
        public String getName(){
            return name;
        }}
}
