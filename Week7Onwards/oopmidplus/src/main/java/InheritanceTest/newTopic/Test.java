package InheritanceTest.newTopic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome to our ERP");

        Scanner sc=new Scanner(System.in);

        try {
            int array[] = {1, 2, 3};
            System.out.println(array[4]);
            int a= sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a / b);
        }
        catch (ArithmeticException e){
            System.out.println("Artihmetic exception is thrwon");
        }
        catch (InputMismatchException e){
            System.out.println("Input mismatch");
        }
        catch (ArrayIndexOutOfBoundsException e){

        }
        catch (Exception e){

        }
        catch (Throwable e){

        }
        System.out.println("Thank you for using this software");

    }
}
