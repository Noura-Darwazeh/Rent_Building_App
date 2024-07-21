
public class Shop extends Place {
	 private String businessType;
	 private boolean hasParking;
	 private boolean hasSecuritySystem;
     
	 public Shop(String address, String name, double size, String businessType, boolean hasParking, boolean hasSecuritySystem) {
		 super( address, name, size);
		 this.businessType = businessType;
		 this.hasParking = hasParking;
		 this.hasSecuritySystem = hasSecuritySystem;
	 }
	 
	 @Override
	    public void getPlaceDetails() {
	        System.out.println("The name of the shop is " + getName() + ", located at " + getAddress() + ". Its size is " + getSize() + " square meters, " +
	                           "business type: " + businessType +
	                            ", Parking: " + (hasParking ? "Yes" : "No") + ", Security System: " + (hasSecuritySystem ? "Yes" : "No") + ".");
	    }
	 @Override
	    public double getRentalPrice() {
	        return getSize() * 30; 
	    }
}
