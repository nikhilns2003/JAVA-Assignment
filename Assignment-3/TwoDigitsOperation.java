import java.util.Scanner;

	public class TwoDigitsOperation {
  	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int num1 = sc.nextInt();
	System.out.print("Enter second number : ");
	int num2 = sc.nextInt();
	System.out.print("Enter Operand (+,-,*,/) : ");
	char op = sc.next().charAt(0);

	switch(op){
		case '+'->System.out.println("Addition : "+(num1+num2));
		case '-'->System.out.println("Substraction : "+(num1-num2));
		case '*'->System.out.println("Multiplication  : "+(num1*num2));
		case '/'->System.out.println("Division : "+(num1/num2));
		default->System.out.println("Invalid Operater !!!");
		}	
	}
}