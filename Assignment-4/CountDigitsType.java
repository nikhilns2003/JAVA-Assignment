import java.util.Scanner;

public class CountDigitsType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        
        int evenCount = 0, oddCount = 0, zeroCount = 0;

        while (number != 0) {
            int digit = number % 10; 
            if (digit == 0) {
                zeroCount++;  
            } else if (digit % 2 == 0) {
                evenCount++;  
            } else {
                oddCount++; 
            }
            number = number / 10;
        }

       
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
        System.out.println("Zero digits: " + zeroCount);
    }
}
