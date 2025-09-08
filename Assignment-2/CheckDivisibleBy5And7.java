import java.util.Scanner;
	public class CheckDivisibleBy5And7 {
	public static void main(String [] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the No :");
	int no = sc.nextInt();
	
	if(no % 5 == 0 && no % 7 ==0)
	System.out.println(no+" is divisible by both 5 and 7");
	else
	System.out.println(no+"is not divisible by both 5 and 7");
	}
}