import java.util.Scanner;

public class NumberOperations {
	public static void main(String[] args) {
	int a,b,c,ch;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter first Number : ");
	a = sc.nextInt();

	System.out.print("Enter Second Number : ");
	b = sc.nextInt();

        System.out.println("\n 1: Equality");
        System.out.println(" 2: Less Than");
        System.out.println(" 3: Quotient and Remainder");
        System.out.println(" 4: Range");
        System.out.println(" 5: Swap");
        System.out.print("Enter your choice: ");
        ch = sc.nextInt();

        switch (ch) {
            case 1: if (a == b)
                    System.out.println("Both numbers are equal");
                    else
                    System.out.println("Both numbers are not equal");
                    break;
                

            case 2: if (a < b)
                    System.out.println("First number is less than second");
                    else if (a > b)
                    System.out.println("Second number is less than first");
                    else
                    System.out.println("Both are equal");
                    break;
                

            case 3: if (b != 0) {
                    System.out.println("Quotient is: " + (a / b));
                    System.out.println("Remainder is: " + (a % b));
                    } else {
                    System.out.println("Error! Division by zero.");
                    }
                    break;
                

            case 4: System.out.print("Enter another number: ");
                     c = sc.nextInt();
                     if ((c > a && c < b) || (c > b && c < a))
                    System.out.println("The third number lies between first and second");
                     else
                    System.out.println("The third number does not lie between first and second");
                     break;      


            case 5: int temp = a;
                    a = b;
                    b = temp;
                    System.out.println("Swapped values: a = " + a + ", b = " + b);
                    break;
                

            default: System.out.println("Invalid choice!");
        	}
	}
}