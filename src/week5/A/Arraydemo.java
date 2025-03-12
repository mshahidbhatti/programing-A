public class Arraydemo{

	public static void main(String[] args){
		//int Integer
		//float Float

		int array1[]=new int[Integer.MAX_VALUE];
		// array1 will be init. with 0

		System.out.println(array1[0]);

		float array2[]=new float[20];
		// type varName = constructor call

		//int[] a,b,c;
		int a[],b[],c[];
		a=new int[4];
		b=new int[4];
		c=new int[4];

		int d[]=new int[89],e;
		System.out.println(d.length);
		//d.length=100; cannot change length of arrays

		// new byte[4];
		byte array3[]={1,2,3,3};
		String daysOftheWeek[]={"Monday","Tues","Wed.."};
		daysOftheWeek[2]="Wednesday";

		System.out.println(daysOftheWeek);
		//for(int i=0;i<daysOftheWeek.length;i++)
		//	System.out.println(daysOftheWeek[i]);
		
		displayArray(daysOftheWeek);

		int x[]=array1;
		String array4[]= getArray(daysOftheWeek);


		

	

	}

	public static void displayArray(String arr[]){

		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	public static String[] getArray(String a[]){
		String temp[]=new String[a.length];
		for(int i=0;i<a.length;i++)
			temp[i]=a[i];
		return temp;
	}


}