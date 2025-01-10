import java.util.*;
public class areaOfTriangle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int base=sc.nextInt();
        int area=(1*height*base)/2;
        double feet=area*0.0328084;
        double inches=area*0.393701;
         System.out.println("Your Height in cm is " + height +" while area in feet is " + feet + "  and in inches is " + inches );

    }
}
