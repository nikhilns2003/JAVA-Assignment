import java.util.Scanner;

public class EvenOddBoth{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter start No :");
	int a = sc.nextInt();
		
	System.out.println("Enter last No :");
	int b = sc.nextInt();	
	
	System.out.print("Enter the Choice\n 1. Even\n 2. Odd ");
	int ch = sc.nextInt();
	
	switch(ch){
		
		case 1 : for(int i = a; i<= b; i+=2){
			System.out.println(i);
			} 
			break;
			
		case 2 : for(int i = a; i<= b; i-=2){
			System.out.println(i);
			} 
			break;

		default : System.out.println("Invalid Coice");
	}
	}
		
}