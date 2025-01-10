import java.util.*;
public class cmtofeet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int height=sc.nextInt();

        double feet=height*0.0328084;
        double inches=height*0.393701;

        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
    }
}
