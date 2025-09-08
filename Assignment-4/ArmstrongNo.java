import java.util.Scanner;
	
public class ArmstrongNo{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the No :");
	int a = sc.nextInt();
	
	int num = a;
	int sum = 0;	
	
	while(num > 0){
	int digit = num % 10;
	sum += digit * digit * digit;
	num = num /10;
	}
	if(a== sum ){
	System.out.println("The no is Armstrong");
	}else{
	System.out.println("The no is Not Armstrong");
	}
	}
}