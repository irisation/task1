/**
 * Created by Iryna_Busel on 1/22/2016.
 */
public class Stone implements Comparable{
	String name;
	double weight;
	float transparency;
    float cost;

	public Stone(String name, double weight, float transparency, float cost) {
		setName(name);
		setWeight(weight);
		setTransparency(transparency);
        setCost(cost);
	}

    public void setCost(float cost) {
        this.cost = cost;
    }

    void setTransparency(float transparency) {
		this.transparency = transparency;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "The stone: " + name + ", transparency: " + transparency + ", weight: " + weight + ", cost: " + cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stone)) return false;

        Stone stone = (Stone) o;

        if (Double.compare(stone.weight, weight) != 0) return false;
        if (Float.compare(stone.transparency, transparency) != 0) return false;
        if (Float.compare(stone.cost, cost) != 0) return false;
        return name.equals(stone.name);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (transparency != +0.0f ? Float.floatToIntBits(transparency) : 0);
        result = 31 * result + (cost != +0.0f ? Float.floatToIntBits(cost) : 0);
        return result;
    }

    public int compareTo(Object obj) {
        Stone tmp = (Stone)obj;
        if(this.cost < tmp.cost)
        {
            return -1;
        }
        else if(this.cost > tmp.cost)
        {
            return 1;
        }
        return 0;
    }
}
