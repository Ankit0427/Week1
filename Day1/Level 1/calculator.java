import java.util.*;
public class calculator {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers  "+  a + " and " + b + " is" + (a+b) + " " + (a-b) + " "+(a*b) +" " + (a/b)) ;
    }
}
