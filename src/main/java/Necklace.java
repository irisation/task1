import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Iryna_Busel on 1/22/2016.
 */
public class Necklace {

	List<Stone> stones;
	float fullCost;

	public static class Builder {
		List<Stone> stonesHeap;
		List<Stone> stones;
		float fullCost;

		public Builder(List<Stone> stones) {
			if (null != stonesHeap) {
				stonesHeap.addAll(stones);
			} else {
				stonesHeap = new ArrayList<Stone>(stones);
			}
		}

		public Builder stoneName(String name) {
			if (null == stones) {
				stones = new ArrayList<Stone>();
			}
			for (Stone stone : stonesHeap) {
				if (stone.name.equalsIgnoreCase(name)) {
					stones.add(StoneFactory.getStone(stone));
					fullCost += stone.cost;
					break;
				}
			}
			return this;
		}

		public Necklace build() {
			return new Necklace(this);
		}
	}

	public Necklace(Builder builder) {
		this.stones = new ArrayList<Stone>(builder.stones);
		this.fullCost = builder.fullCost;
	}

	public void sort() {
		stones.sort(Comparator.<Stone> reverseOrder());
	}

	public List<Stone> getStonesByTransparency(float min, float max){
		List<Stone> stonesSelected = new ArrayList<>();
		for (Stone stone : stones) {
			if(stone.transparency >= min && stone.transparency <= max){
				stonesSelected.add(stone);
			}
		}
		return stonesSelected;
	}
	@Override
	public String toString() {
		return "This beautiful necklace consists of " + stones + ", fullCost is " + fullCost;
	}
}
