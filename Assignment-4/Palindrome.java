import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the no :");
	int a = sc.nextInt();
	
	int num = a;
		
	int reverse = 0;
	
	while(num > 0){
	int digit = num % 10;
	reverse = reverse * 10 + digit;
	num = num /10;	
	}
	if(a==reverse){
	System.out.println("The no is palandrome");
	}else{
	System.out.println("The no is not palandrome");
	}
	}	
}