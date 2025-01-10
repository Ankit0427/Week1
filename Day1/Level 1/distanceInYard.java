
import java.util.*;
public class distanceInYard  {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int feet=sc.nextInt();
       
        double yard= feet * 0.333333;
        double miles=feet * 0.000189394;
       
         System.out.println("Your Height in feet is " + feet +" while in yard is  " + yard + " and miles is" + miles );

    }
}
