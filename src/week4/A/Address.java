public class Address{

	String country;

	Address(String country){
		this.country=country;

	}

	Address(Address address){
		this.country=address.country;
	}

}