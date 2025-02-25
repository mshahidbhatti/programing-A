public class Product{
	private static int productCounter=1;
	private String id;
	private String name;

	private int quantity;
	private double price;
	private String category;

	public Product(String name1, int qty, double price1, String cat){

		name = name1;
		quantity=qty;
		price = price1;
		category=cat;
	id= "E"+String.format("%04d",productCounter++);

		//id= "E"+productCounter++;

	}

	public void display(){
		System.out.printf("Id : %s \n", id);
		System.out.printf("name : %s \n", name);
	System.out.printf("quantity : %d \n", quantity);
		System.out.printf("price : %f \n", price);
	System.out.printf("Category : %s \n", category);


	}


	public void setQuantity(int qty){
		if(qty>0)
			quantity=qty;
	}


	public void setPrice(double newPrice){
		if(newPrice>0)
			price=newPrice;
	}

	public double getPrice(){
		return price;
	}





}