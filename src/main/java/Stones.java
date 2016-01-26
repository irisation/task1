import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Iryna_Busel on 1/26/2016.
 */

@XmlRootElement(name = "Stones")
public class Stones {
    @XmlElement(name="Stone")
    List<Stone> stones;
}
