import java.util.Scanner;

public class AcceptTwoNumber {
	public static void main(String[] args) {
		float A,B;
		double AM,HM;
		Scanner sc = new Scanner(System.in);
	// Arithmetic Mean = (A+B)/2 , Harmonic Mean = (A*B)/(A+B) 

		System.out.println("Enter a Number A : ");
		A = sc.nextFloat();
		
		System.out.println("Enter a Number B : ");
		B = sc.nextFloat();

		AM = (A+B)/2;
		HM = (A*B)/(A+B);

		System.out.println("Arithmetic Mean (AM) : "+AM);
		System.out.println("Harmonic Mean (HM) : "+HM);

		}
	}
		

