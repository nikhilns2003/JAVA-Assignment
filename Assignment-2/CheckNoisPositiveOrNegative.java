import java.util.Scanner;
	public class CheckNoisPositiveOrNegative {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the Number : ");
	int n = sc.nextInt();

	if(n>0)
		System.out.println(n+ "The Number is Positive");
	else if(n<0)
		System.out.println(n+ "The Number is Negative");
	else 
		System.out.println(n+"The Number is Zero");
		}
	}
