import java.util.*;
public class KMtoMiles{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double km = sc.nextDouble();
	
	double miles = km * 0.621371 ;
	
	System.out.println(km +" kilometer is equal to " + miles + " miles");
	
	}
	
}