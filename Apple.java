/*/Landon Barden's Work/*/
public class Apple{

	private String type;
	private double weight;
	private double price;
	
	public Apple() { //The default object, activates if the required parameters aren't given
		type = "Gala";
		weight = 0.0;
		price = 0.0;
	}

	public Apple(String t, double w, double p) {
		setType(t);
		setWeight(w);
		setPrice(p);
	}
	
	public void setType(String t){
		if (t == "Gala")
		{
			this.type = t;
		}
		else if(t == "Red Delicious")
		{
			this.type = t;
		}
		else if(t == "Golden Delicious")
		{
			this.type = t;
		}
		else if(t == "Granny Smith")
		{
			this.type = t;
		}
		else
		{
			this.type = "Gala"; //If the type isn't any of the above, then it sets the type equal to Gala
		}
	}
	
	public String getType() {
		return type;
	}
	
	public void setWeight(double w){
		if(w <= 2.0 && w >= 0.0)
		{
			this.weight = w;
		}
		else
		{
			this.weight = 0.0;
		}
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setPrice(double p) {
		if(p <= 0.0){
			this.price = 0.0;
		}
		else {
			this.price = p;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		getPrice();
		getWeight();
		getType();
		String appleOutput = ("Type: "+type+"\nWeight: "+weight+"\nPrice: "+price); //Converts to string
		return appleOutput;
	}
	
	public boolean equals(Apple a1) {
		if(a1.type == this.getType()) {//treats "this" as the object acting as the equals and the parameter as a1
			return true;
		}
		else {
			return false;
		}
	}

}