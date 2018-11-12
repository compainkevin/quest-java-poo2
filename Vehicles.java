
public abstract class Vehicles {
	//Attributes
	private String brand;
	private int kilometers;
	
	//constructor
	public Vehicles(String brand, int kilometers) {
		this.brand = brand;
		this.kilometers= 0;
	}
	
	//getters & setters
	public String  getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public int getKilometers() {
		return this.kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	//méthodes
	public abstract String doStuff(); 
		
	
	
}
	
	
