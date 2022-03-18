package georgio_nassar_202003039;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    
       public Employee(){
        
        Scanner scan = new Scanner(System.in);
                   
        System.out.print("Please input the employee's first name: ");
        firstName=scan.nextLine();
        System.out.print("Please input the employee's last name: ");
        lastName=scan.nextLine();
        System.out.print("Please input the employee's age: ");
        age=scan.nextInt();
        System.out.print("Please input the employee's salary: ");
        salary=scan.nextDouble();
        
    }  
    
    NumberFormat fmt1=NumberFormat.getCurrencyInstance();
    
    public String toString(){
        return "Employee Information: "+firstName+" "+lastName+", "+age+", "+fmt1.format(salary);
    }
}