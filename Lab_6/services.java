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
        int count = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Which service would you like to use?"+"\n"+"[1]: Basic week visualizer"+"\n"+"[2]: Advanced week visualizer"+"\n"+"[3]: Basic calculator"+"\n"+"[4]: Employee repertoire");
        input = scan.nextInt();
        
         while (input < 0 || input > INPUT)
    {
        System.out.print("Invalid input. Please reenter: ");
        input = scan.nextInt();
    }
        while (input >= 1 && input <= 4)
    {
            switch(input)
            {
              
            case 1: 
                
//                 String day1= "Monday";
//                 String day2= "Tuesday";
//                 String day3= "Wednesday";
//                 String day4= "Thursday";
//                 String day5= "Friday";
//                 String day6= "Saturday";
//                 String day7= "Sunday";
//                 
//                 basicWeek days=new basicWeek(day1,day2,day3,day4,day5,day6,day7);
                   BasicWeekVisualizer days=new BasicWeekVisualizer();
                   days = days.print(days);
                  System.out.println();                
                
               // System.out.println("The basic days of the week are: "+day1+" "+day2+" "+day3+" "+day4+" "+day5+" "+day6+" "+day7);
                return;
            case 2: 
                
                int index=1;
                
                 String day_1= "Monday";
                 String day_2= "Tuesday";
                 String day_3= "Wednesday";
                 String day_4= "Thursday";
                 String day_5= "Friday";
                 String day_6= "Saturday";
                 String day_7= "Sunday";
                          
                System.out.print(index+": "+day_1+","+"\n"+(index+1)+": "+day_2+","+"\n"+(index+2)+": "+day_3+","+"\n"+(index+3)+": "+day_4+","+"\n"+(index+4)+": "+day_5+","+"\n"+(index+5)+": "+day_6+","+"\n"+(index+6)+": "+day_7+".");
                break;
            case 3:
                
                
            default: 
                System.out.println("Go");
                
            }
    }
}
            }