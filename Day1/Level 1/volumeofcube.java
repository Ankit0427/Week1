public class volumeofcube{
 	
	public static void main(String[] args)
{
	int radius=6378 ;
	double area= ( 4 * Math.PI * Math.pow(radius,3) ) /3;
	System.out.println(" The volume of earth in cubic kilometers is " + area + " and cubic miles is " + area*0.239913 );
}
}