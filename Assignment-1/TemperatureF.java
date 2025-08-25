import java.util.Scanner;

public class TemperatureF{
	public static void main(String[] args){
		float F;
		double C,K;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Temperature in Fahrenheit : ");
		F = sc.nextFloat();

		C = (F-32) * 5 / 9;
		K = C + 273.15;

		System.out.println("Temperature in Celsius : "+C);
		System.out.println("Temperature in Kelvin : "+K);

		}
	}