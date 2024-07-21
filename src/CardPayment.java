
public class CardPayment implements PaymentMethod {
	private String cardNumber;
    private String cardName;
    
    public CardPayment (String cardNumber, String cardName)
    {
    	this.cardNumber = cardNumber;
    	this.cardName = cardName;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "$" + " for card holder " + cardName);
    }
    @Override
    public String getPaymentType() {
    	return "Credit Card";
    }
}
