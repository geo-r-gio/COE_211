public class Employee {
    
    private String firstName;
    private String lastName;
    private  int age;
    private double salary;
    
       public Employee(String newfirstName, String newlastName, int newage, double newsalary){
        firstName=newfirstName;
        lastName=newlastName;
        age=newage;
        salary=newsalary;
    }
    
    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(String newfirstName){
        firstName=newfirstName;
    }
    
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String newlastName){
        lastName=newlastName;
    }
    
    public int getage(){
        return age;
    }
    public void setage(int newage){
        age=newage;
    }
    
    public double getsalary(){
        return salary;
    }
    public void setsalary(double newsalary){
        salary=newsalary;
    }
    
    public String toString(){
        return "Employee Information: "+firstName+" "+lastName+", "+age+", "+salary;
    }
}