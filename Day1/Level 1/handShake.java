
import java.util.*;
public class handShake {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int numberOfStudents =sc.nextInt();
        
        int handShake=(numberOfStudents*(numberOfStudents+1))/2;
       
         System.out.println("Total Handshake is " + handShake);

    }
}