
public class Boat extends Vehicles{
	
	private boolean navigating;
	
	public Boat(String brand) {
		super (brand);
		this.navigating = false;
	}
	
	@Override
	public String toStuff() {
		return "Pouet pouet";
	}
	
	public boolean isNavigate() {
		return navigating;
	}
	
	public void setNavigate(boolean navigating) {
		this.navigating  = navigating;
	}

	
	

}
