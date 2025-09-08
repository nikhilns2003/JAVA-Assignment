import java.util.Scanner;

public class TotalAddition{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int a, n;
	System.out.println("Enter the no to add :");

	a= sc.nextInt();
	n= sc.nextInt();
	
	int sum = 0;

	for(int i = a; i <= n; i++){
	
	sum += i;
	
	}
	System.out.println(sum);
	}	
}