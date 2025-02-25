public class ProductTest{

	public static void main(String args[]){

	Product p1 = new Product("keyboard",3,500,"computer");
	p1.display();

Product p2 = new Product("connector",3,500,"computer");
	p2.display();

	p2.setQuantity(4);
	p2.display();

	p2.setPrice(p2.getPrice()*1.1);
	p2.display();

	}


}