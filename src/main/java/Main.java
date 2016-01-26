import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Created by Iryna_Busel on 1/22/2016.
 */
public class Main {

	public static final Logger LOG = Logger.getLogger(Main.class);

	public static void main(String[] args) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(Stones.class);

		Unmarshaller unmarshaller = jc.createUnmarshaller();
		List<Stone> stoneHeap = ((Stones) unmarshaller.unmarshal(new File("D:\\pdp\\task1\\src\\main\\resources\\input.xml"))).stones;



//		Marshaller marshaller = jc.createMarshaller();
//		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//		marshaller.marshal(stoneHeap, System.out);

//		ArrayList<Stone> stones = new ArrayList<Stone>();
//		stones.add(new Stone("Diamond", 5, 0.5f, 1000));
//		stones.add(new Stone("Turquoise", 5, 0.5f, 1000));
//		stones.add(new Stone("Amber", 5, 0.5f, 1000));
//		stones.add(new Stone("Sapphire", 5, 0.5f, 1000));

		Stone current = StoneFactory.getStone(stoneHeap.get(0));
		Stone current2 = StoneFactory.getStone(stoneHeap.get(1));
        LOG.info(current);
        LOG.info(current2);
        Necklace necklace = new Necklace.Builder(stoneHeap).stoneName("Diamond").stoneName("Sapphire").build();
        LOG.info(necklace);

	}
}
