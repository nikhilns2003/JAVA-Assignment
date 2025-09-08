import java.util.Scanner;
	
public class NoCountEvenOdd{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int count = 0;
	int fact = 1;
	System.out.print("Enter no :");
	int a = sc.nextInt();
		
	System.out.print("Enter Choice\n 1. Even\n 2. Odd");
	int ch = sc.nextInt();
	
	switch(ch){
	
	case 1 : if(a % 2 == 0)
		 {while(a != 0)
		 {a = a/10;
		 count ++;
		 }
		 System.out.println(count);
		}	
		 break;
		 
	
	case 2 :  while(a != 0)
		 {a = a/10;
		 count ++;
		 }
		 break;
		 System.out.println(count);
		}
	}
}