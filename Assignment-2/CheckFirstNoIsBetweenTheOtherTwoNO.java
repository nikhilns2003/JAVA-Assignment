import java.util.Scanner;
	public class CheckFirstNoIsBetweenTheOtherTwoNO {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a : ");
	int a = sc.nextInt();
	System.out.print("Enter b : ");
	int b = sc.nextInt();
	System.out.print("Enter c : ");
	int c = sc.nextInt();
	
	if(a > b && a < c || a < b && a > c)
		System.out.println(""+a+" is between "+b+" and "+c+"");
	else
		System.out.println(""+a+" is not between "+b+" and "+c+"");
	}
}