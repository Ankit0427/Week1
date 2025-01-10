import java.util.*;
public class farCel{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int farenhite = sc.nextInt();
        double celcius = (farenhite - 32 ) + 5/9 ;
        System.out.println("The " + farenhite + "farenhite is " +  celcius );

        sc.close();

    }
}