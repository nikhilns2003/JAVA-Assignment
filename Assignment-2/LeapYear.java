import java.util.Scanner;
	public class LeapYear {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Year : ");
	int year = sc.nextInt();

	if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		System.out.println("The Year is Leap"+year);
	else
		System.out.println("The Year is Not Leap !!"+year);

	}
}