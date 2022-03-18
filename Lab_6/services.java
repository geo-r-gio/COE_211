package georgio_nassar_202003039;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class services {
    
    public static void main(String[] args){
        
        final int INPUT = 4;
        int input;      
        String operation;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Which service would you like to use?"+"\n"+"[1]: Basic week visualizer"+"\n"+"[2]: Advanced week visualizer"+"\n"+
                "[3]: Basic calculator"+"\n"+"[4]: Employee repertoire");
        input = scan.nextInt();
        
         while (input <= 0 || input > INPUT)
    {
        System.out.print("Invalid input. Please reenter: ");
        input = scan.nextInt();
    }
        while (input >= 1 && input <= 4)
    {
            switch(input)
            {
              
            case 1: 

                  BasicWeek days=new BasicWeek();
             
                  System.out.println("The basic days of the week are: "+days.toString());                
                             
                break;
            case 2: 
                            
                   AdvancedWeek week=new AdvancedWeek();
                   
                   System.out.println("The advanced days of the week are: "+week.toString());
                 
                  break;
            case 3:
               
                Calculator calc=new Calculator();                  
                
                System.out.print(calc.toString());
                
                break;
            case 4:
                
                Employee emp=new Employee();
                
                System.out.println(emp.toString());
                
                break;                                  
            default: 
              
                break;
                                
            }
                                    
            System.out.println("Would you like to perform another operation? (y/n)");
            operation=scan.next(); 
            
            if(null == operation) 
                System.out.println("Error in Character Identification.");
            else 
                         switch (operation) {
                case "y":
                    System.out.println("Which service would you like to use?"+"\n"+"[1]: Basic week visualizer"+"\n"+"[2]: Advanced week visualizer"+"\n"+
                            "[3]: Basic calculator"+"\n"+"[4]: Employee repertoire");
                    input = scan.nextInt();
                     
                    while (input <= 0 || input > INPUT)
                   {
                    System.out.print("Invalid input. Please reenter: ");
                    input = scan.nextInt();
                   }             
                    continue;
                case "n":
                    System.out.print("");
                    break;
                default:
                    System.out.println("Error in Character Identification.");
                    break;
            }
                    return;                
                                           
       
     }
  }
}
