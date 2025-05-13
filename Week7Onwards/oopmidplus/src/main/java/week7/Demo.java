package week7;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Person 1",20);
        Employee employee = new Employee("Employee 1",30,"123123","teacher");
        System.out.println(person);
        System.out.println();
        System.out.println(employee);

        ContractEmployee employee1 = new ContractEmployee("Employee 1",30,"123123","teacher",100000,12);
        System.out.println(employee1);
        System.out.println(employee1.calculateSalary());

        RegularEmployee employee3=new RegularEmployee("Employee 3",30,"123123","teacher",131232,2000);


        Employee emp5=new Employee();

        Object o=person;  // upcasting is impicit

        Employee employee12=(Employee) person;

        Random random=new Random();

        //downcasting expilict
        Employee list[]=new Employee[100];
        list[0]=new ContractEmployee("Employee 1",30,"123123","teacher",100000,12);
        list[1]=new RegularEmployee("Employee 3",30,"123123","teacher",131232,2000);

        RegularEmployee regular=new RegularEmployee();

        Object o1=regular; //
        Person person2=regular;
        Employee employee4=regular;

        RegularPlusCommissionEmployee regularPlusCommissionEmployee=(RegularPlusCommissionEmployee) regular;



        ((ContractEmployee)list[0]).setContractDuration(23);
        if(list[0] instanceof RegularEmployee)
            System.out.println("list[0]instanceof RegularEmployee");


        for(int i=0; i<list.length; i++)
        {
            if(list[i] instanceof RegularEmployee)
            {
                // list[0].getBaseSalary();
                RegularEmployee temp=(RegularEmployee)list[0];
                temp.setBaseSalary(temp.getBaseSalary()+temp.getBaseSalary()*.01);
            }
        }

    }
}
