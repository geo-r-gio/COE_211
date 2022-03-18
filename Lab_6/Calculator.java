package georgio_nassar_202003039;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Calculator {
        
    public int num1;
    public int num2;
    private int result;    
    private String operator;
           
    public Calculator(){
           
        Scanner scanCalc = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        num1=scanCalc.nextInt();
        System.out.print("Input the operator: ");
        operator=scanCalc.next();
        System.out.print("Input the second number: ");
        num2=scanCalc.nextInt();
        
       
                switch (operator)
                {
                   case "+":
                      
                      result=num1+num2; 
                      System.out.println(add(num1,num2));
                      break;
                   
                   case "-":
                       
                      result=num1-num2; 
                      System.out.println(subtract(num1,num2));
                      break;
                
                   case "*":
                       
                       result=num1*num2;
                       System.out.println(multiply(num1,num2));
                       break;
                       
                   case "/":
                       
                       result=num1/num2;
                       System.out.println(divide(num1,num2));  
                       break;
                       
                   default:
                       System.out.println("Error in Character Identification.");
                       break;
                                                                     
                }
                                    
        }
    
        
        public String add(int num1, int num2){  
            result=num1+num2;
            return num1+"+"+num2+"="+result;
        }
        
        public String subtract(int num1, int num2){
            result=num1-num2;
            return num1+"-"+num2+"="+result;
        }
        
        public String multiply(int num1, int num2){
            result=num1*num2;
            return num1+"*"+num2+"="+result;
        }
        
        public String divide(int num1, int num2){
            result=num1/num2;
            return num1+"/"+num2+"="+result;
        }
                
        public  String toString(){
            return "";
        }
              
    
    }
