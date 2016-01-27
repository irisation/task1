import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

/**
 * Created by Iryna_Busel on 1/22/2016.
 */
public class Main {

	public static final Logger LOG = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(Stones.class);

			Unmarshaller unmarshaller = jc.createUnmarshaller();
			List<Stone> stoneHeap = ((Stones) unmarshaller.unmarshal(new File("D:\\pdp\\task1\\src\\main\\resources\\input.xml"))).stones;

			// Marshaller marshaller = jc.createMarshaller();
			// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// marshaller.marshal(stoneHeap, System.out);

			Stone current = StoneFactory.getStone(stoneHeap.get(0));
			Stone current2 = StoneFactory.getStone(stoneHeap.get(1));
			LOG.info(current);
			LOG.info(current2);
			Necklace necklace = new Necklace.Builder(stoneHeap).stoneName("Diamond").stoneName("Sapphire").stoneName("Turquoise")
					.stoneName("Amber").build();
			LOG.info(necklace);
			necklace.sort();
			LOG.info(necklace);
			LOG.info(necklace.getStonesByTransparency(0.5f, 0.6f));
		} catch (JAXBException e) {
			LOG.error(e.getMessage());
		}
	}
}
