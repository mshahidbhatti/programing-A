public class Product{

	String name;
	double price;
	Date doe;

	Product(String name, double price, Date doe){

		if(doe!=null)
			this.doe=doe;
	}


}