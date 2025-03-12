public class ArrayDemo2{

	public static void main(String args[]){
		Product list[]=new Product[20];

		list[0]=new Product("",0);

		for(int i=0;i<list.length;i++)
			list[i]=new Product("Product "+i,100+i );

		displayProducts(list); //method call


	}

	public static void displayProducts(Product []list){
		for(int i=0;i<list.length;i++)
			System.out.println(list[i].toString());
	}

}

class Product{
	String name;
	double price;
	Product(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	@Overrirde
	public String toString(){
		return String.format("%s %f \n",name,price);
	}

}