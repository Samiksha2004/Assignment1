import java.util.*;
public class CelciustoFahrenheit{
	public static void main(String args[]){
	Scanner sc = new Scanner();
	double celcius = sc.nextInt();
	
	double fahrenheit = (celcius * 9/5) + 32;
	
	System.out.println("temperature in fahrenheit is" + fahrenheit);
	}
}