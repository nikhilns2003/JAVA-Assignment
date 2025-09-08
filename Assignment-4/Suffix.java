import java.util.Scanner;
	
public class Suffix{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int fact = 1;
	System.out.println("Enter the no :");
	int a = sc.nextInt();
	

	System.out.println("Enter the exponent no :");
	int b = sc.nextInt();
	
	for(int i = 0; i<= b ; i++){
	fact *= a;
	}
	System.out.println(fact);
	}
}