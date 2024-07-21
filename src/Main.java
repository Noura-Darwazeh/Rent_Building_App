
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1 = new Customer("noura", "noura@gmail.com", "0599898984");
		customer1.customerInfo();
		
		Place apartment = new Apartment(3, "Maajeen Street", "haifa", 100, "sea", 2, 3 );
		apartment.WelcomeAnnouncement();
		apartment.getPlaceDetails();
		
		Place house = new House(true, 4, true, "Nasaria", "Green House", 200);
		house.getPlaceDetails();
		
		Place shop = new Shop("Amman Street", "N&D fashion", 60, "Clothing", true , false);
		shop.getPlaceDetails();
		
		PaymentMethod payment1 = new PayPalPayment("john@example.com");
		payment1.pay(500);
		
		PaymentMethod payment2 = new CardPayment("1234567890123456", "noura");
        payment2.pay(50);
        
        Contract contract1 = new Contract(customer1, apartment, 12, apartment.getRentalPrice(),payment1 );
        customer1.addContract(contract1);
        contract1.generateContract();
        
        Contract contract2 = new Contract(customer1 ,house, 10, house.getRentalPrice(),payment2);
        
        contract2.generateContract();
        customer1.addContract(contract2);
        
        payment1.pay(contract1.getPrice());
        payment2.pay(contract2.getPrice());
        
	}

}
