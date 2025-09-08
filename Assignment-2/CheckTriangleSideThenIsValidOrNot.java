import java.util.Scanner;
	public class  CheckTriangleSideThenIsValidOrNot {
	public static void main(String [] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first side of Triangle :");
	int pq = sc.nextInt();
	System.out.print("Enter second side of Triangle :");
	int qr = sc.nextInt();
	System.out.print("Enter third side of Triangle :");
	int pr = sc.nextInt();

	if((pq + qr) > pr && (pq + pr) > qr && (pq + qr) > pr)
		System.out.println("Triangle is valid");
	else 
		System.out.println("Triangle is not valid !!");
	}
}