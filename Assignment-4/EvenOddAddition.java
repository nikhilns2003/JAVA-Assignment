import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start No :");
        int a = sc.nextInt();

        System.out.println("Enter last No :");
        int b = sc.nextInt();

        System.out.print("Enter the Choice\n 1. Even\n 2. Odd ");
        int ch = sc.nextInt();
        int sum = 0;

        switch (ch) {

            case 1:
               
                if (a % 2 != 0) {
                    a++;
                }
               
                for (int i = a; i <= b; i += 2) {
                    System.out.println(i);
                    sum += i;
                }
                System.out.println("Sum of even numbers: " + sum);
                break;

            case 2:
               
                if (a % 2 == 0) {
                    a++; 
                }
             
                for (int i = a; i <= b; i += 2) {
                    System.out.println(i);
                    sum += i;
                }
                System.out.println("Sum of odd numbers: " + sum); 
                break;

            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
