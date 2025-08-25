import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        	System.out.print("Enter first number (a): ");
        	int a = sc.nextInt();
        	System.out.print("Enter second number (b): ");
        	int b = sc.nextInt();

        	//  Using Temporary Variable
        	System.out.println("\n--- Using Temporary Variable ---");
        	int temp = a;
        	a = b;
        	b = temp;
        	System.out.println("a = " + a + ", b = " + b);

        	// Reset values for next method
        	System.out.print("\nEnter first number (a): ");
        	a = sc.nextInt();
        	System.out.print("Enter second number (b): ");
        	b = sc.nextInt();

        	//  Using + and - operator
        	System.out.println("\n--- Using + and - ---");
        	a = a + b;
        	b = a - b;
        	a = a - b;
        	System.out.println("a = " + a + ", b = " + b);

        	// Reset values for next method
        	System.out.print("\nEnter first number (a): ");
        	a = sc.nextInt();
        	System.out.print("Enter second number (b): ");
        	b = sc.nextInt();

        	//  Using * and / operator
        	System.out.println("\n--- Using * and / ---");
        	a = a * b;
        	b = a / b;
        	a = a / b;
        	System.out.println("a = " + a + ", b = " + b);

    		}
	}