
public class ArrayTest{
public static void main(String args[]){


	Book books[]=new Book[500];

	for(Book b1: books) //	
		b1=new Book("Book 1");

	for(int i=0;i<books.length;i++)
		books[i]=new Book("Book "+i);

	for(int i=0;i<books.length;i++)
		System.out.println(books[i].title);

	for(Book b1: books) //	
		System.out.println(b1);
	



	A arrayOfA[] =new A[10];
	for(int i=0;i<arrayOfA.length;i++)
		arrayOfA[i]=new A();


	arrayOfA[0]=new A();

	for(int i=0;i<10;i++)
		System.out.println(arrayOfA[i]);

  	
	int arra[]=new int[30];
   
	int [] a, b=new int[4], c=new int[6];

	//a = new int[Integer.MAX_VALUE-1];

	System.out.println(Integer.MAX_VALUE);

	int d[]={1,2,3,4};

//	a[0]=324;

//		int x=a[7];

	//System.out.println(a[7]);
	}

}
	
