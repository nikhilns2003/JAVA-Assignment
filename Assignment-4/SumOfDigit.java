import java.util.Scanner;
	
public class SumOfDigit{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the no  :");
	int a = sc.nextInt();
		
	int sum = 0;
	while(a>0){
	sum += a%10;
	a = a/10;
	}
	System.out.println(sum);
	}
}