import java.util.Scanner;

public class EntryPoint {
    
    public static void main(String[] args){
        
        String firstName, lastName;
        int age;
        double salary;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please input the employee's first name: ");
        firstName=scan.nextLine();
        System.out.print("Please input the employee's last name: ");
        lastName=scan.nextLine();
        System.out.print("Please input the employee's age: ");
        age=scan.nextInt();
        System.out.print("Please input the employee's salary: ");
        salary=scan.nextDouble();
        
        Employee employee1=new Employee(firstName,lastName,age,salary);
        
        System.out.println(employee1);
        
    }
    
}