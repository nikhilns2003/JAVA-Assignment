import java.util.Scanner;
	
public class NoCount{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int fact = 1;
	System.out.println("Enter the no :");
	int a = sc.nextInt();
	
	int count = 0;

	while(a != 0){
	a = a/10;
	count ++;
	}
	System.out.println(count);
	}
}