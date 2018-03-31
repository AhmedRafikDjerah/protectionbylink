
public class MyLink {
	
	private int id;
	private double weight;
	
	public MyLink(int id, double weight) {
		this.id = id;
		this.weight = weight;
	}
	
	 
	public String toString() {
		return "ID = "+ this.id + " W = " + this.weight;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getWeight() {
		return this.weight;
	}
	


}
