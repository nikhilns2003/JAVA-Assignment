import java.util.Scanner;
	public class CheckNoisOddOrEven {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the Number : ");
	int n = sc.nextInt();

	if(n % 2 == 0)
		System.out.println(n+ "The Number is Even");
	else 
		System.out.println(n+ "The Number is Odd");
	
		}
	}
