
public class Apartment extends Place {
	private int floor;
	private String view;
	private int numberOfBathrooms;
	private int numberRooms;
	public Apartment(int floor, String address, String name, double size, String view, int numberOfBathrooms, int numberRooms) {
		super( address, name, size);
		this.floor = floor;
		this.view = view;
		this.numberOfBathrooms = numberOfBathrooms;
		this.numberRooms = numberRooms;
	}
    
	@Override
	public void getPlaceDetails()
	{
		System.out.println("The name of the apartment is " + getName() + ", on the " + floor + " floor, and it is located on " + getAddress() + ". Its size is " + getSize() + " square meters, " + numberOfBathrooms + " bathrooms. " +
		numberRooms + " Rooms. "+
        ", and its view: " + view + ".");
     }
	@Override
    public double getRentalPrice() {
        return getSize() * 10;
    }
}
