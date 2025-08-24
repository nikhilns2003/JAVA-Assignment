import java.util.Scanner;

public class Cylinder{
	public static void main(String[] args){
		float r,h;
		double Area,Volume;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Radius : ");
		r = sc.nextFloat();

		System.out.println("Enter Height : ");
		h = sc.nextFloat();

		Area = 2*Math.PI*r*r + 2*Math.PI*r*h;
		Volume = Math.PI*r*r*h;

		System.out.println("Area is : "+Area);
		System.out.println("Volume is : "+Volume);

		}
	}
		