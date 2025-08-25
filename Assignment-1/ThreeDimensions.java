import java.util.Scanner;
	
public class ThreeDimensions {
	public static void main(String[] args) {
		float L,B,H;
		double SA,V;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a length : ");
		L = sc.nextFloat();

		System.out.println("Enter a breadth : ");
		B = sc.nextFloat();

		System.out.println("Enter a height : ");
		H = sc.nextFloat();

		SA = 2*((L*B) + (L*H) + (B*H));
		V = L*B*H;

		System.out.println("Surface Area is : "+SA);
		System.out.println("Volume is : "+V);

		}
	}