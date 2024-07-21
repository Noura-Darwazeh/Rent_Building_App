
abstract class Place {
	private String address;
	private String name;
	private double size; 
	
	public Place (String address, String name, double size)
	{
		this.address = address;
		this.name = name;
		this.size = size;
		
	}
	public void WelcomeAnnouncement()
	{
		System.out.println("Welcome to the estate rental application. You can rent an apartment, house, or shop at a price that suits you");
	}
	public abstract void getPlaceDetails();
	public abstract double getRentalPrice();
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
}
