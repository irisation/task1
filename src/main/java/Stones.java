import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Iryna_Busel on 1/26/2016.
 */

@XmlRootElement(name = "Stones")
public class Stones {
	@XmlElement(name = "Stone")
	List<Stone> stones;
}
