
public class Contract {
    private Customer customer;
    private Place place;
    private int rentalPeriod;
    private double price;
    private PaymentMethod paymentMethod;
    
    public Contract(Customer customer, Place place, int rentalPeriod, double price, PaymentMethod paymentMethod)
    {
    	this.customer = customer;
    	this.place = place;
    	this.rentalPeriod = rentalPeriod;
    	this.price = price;
    	this.paymentMethod = paymentMethod;
    }

	public Customer getCustomer() {
		return customer;
	}

	public Place getPlace() {
		return place;
	}

	public int getRentalPeriod() {
		return rentalPeriod;
	}

	public double getPrice() {
		return price;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	
	public void generateContract() {
        System.out.println("Generating contract for customer: " + customer.getName());
        System.out.println("Building: " + place.getName());
        System.out.println("Address: " + place.getAddress());
        System.out.println("Rental Period: " + rentalPeriod + " months");
        System.out.println("Total Price: $" + price);
        System.out.println("Payment Method: " + paymentMethod.getPaymentType());
	}
}
