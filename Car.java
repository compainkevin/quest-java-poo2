
public class Car extends Vehicles {
	
	private boolean rolling;
	
	public Car(String brand) {
		super (brand);
		this.rolling = false;
	}
	
	@Override
	public String toStuff() {
		return "Tututut";
	}
	
	public boolean isRolling() {
		return rolling;
	}
	
	public void setRolling(boolean rolling) {
		this.rolling = rolling;
	}

}
