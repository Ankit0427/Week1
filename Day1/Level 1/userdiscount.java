import java.util.*;
public class userdiscount {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int fee=sc.nextInt();
        int discount_percent=sc.nextInt();
        int discount=(fee*discount_percent)/100;
        int final_fee=fee-discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + final_fee);
    }
    
}
