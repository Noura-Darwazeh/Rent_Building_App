import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String email;
	private String phone;
    private List<Contract> contracts;
    
	public Customer(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.contracts = new ArrayList<>();
	}

	public void addContract(Contract contract) {
        contracts.add(contract);
        
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contract> getContracts() {
		return contracts;
	}
	
	public void customerInfo() {
		System.out.println("Customer name: " + name);
		System.out.println("Customer email: " + email);
		System.out.println("Customer phone: " + phone);

	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}
}
