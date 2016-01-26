import java.util.ArrayList;

import org.apache.log4j.Logger;

/**
 * Created by Iryna_Busel on 1/22/2016.
 */
public class Main {

	public static final Logger LOG = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		ArrayList<Stone> stones = new ArrayList<Stone>();
		stones.add(new Stone("Diamond", 5, 0.5f, 1000));
		stones.add(new Stone("Turquoise", 5, 0.5f, 1000));
		stones.add(new Stone("Amber", 5, 0.5f, 1000));
		stones.add(new Stone("Sapphire", 5, 0.5f, 1000));

		Stone current = StoneFactory.getStone(stones.get(0));
		Stone current2 = StoneFactory.getStone(stones.get(1));
        LOG.info(current);
        LOG.info(current2);
        Necklace necklace = new Necklace.Builder(stones).stoneName("Diamond").build();
        LOG.info(necklace);

	}
}
