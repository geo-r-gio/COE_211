import java.util.Scanner;

public class GradesAggregator {
    
    public static void main(String[] args){
        
        int total=0;
        double attendance, midterm, average, resultAssignment, resultAttendance, resultMidterm;
        int[] assignment = new int[5];
                
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            System.out.print("Input the grade of assignment "+(i+1)+": ");
            assignment[i]=scan.nextInt();
            total = total+assignment[i];
        }
        
        System.out.print("Input the number of attended labs: ");
        attendance=scan.nextInt();
        System.out.print("Input the midterm grade: ");
        midterm=scan.nextInt();
        
        average = total/5;
        
        resultAssignment = (double) average*0.3;
        resultAttendance = (double) (attendance/7)*100*0.05;
        resultMidterm = (double) midterm*0.3;
        
        System.out.println("Assignments (30%): "+resultAssignment);
        System.out.println("Attendance (5%): "+resultAttendance);
        System.out.println("Midterm (30%): "+resultMidterm);
    }
    
}