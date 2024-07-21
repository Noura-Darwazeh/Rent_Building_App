
public class House extends Place {
	private boolean hasGarden;
	private int numberOfFloors;
	private boolean hasSwimmingPool;
	
	public House(boolean hasGarden, int numberOfFloors,boolean hasSwimmingPool, String address, String name, double size) {
		super( address, name, size);
		this.hasGarden = hasGarden;
		this.numberOfFloors = numberOfFloors;
		this.hasSwimmingPool =hasSwimmingPool;
	}
	
	@Override
	public void getPlaceDetails(){
		 System.out.println("The name of the house is " + getName() + ", located at " + getAddress() + ". It has " + getSize() + " square meters, " +
                 numberOfFloors + " floors, " + "Garden: " + (hasGarden ? "Yes" : "No") + ", Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No") + ".");
		 }
	@Override
    public double getRentalPrice() {
        return getSize() * 20;
    }
}
