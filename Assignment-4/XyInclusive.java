import java.util.Scanner;

public  class XyInclusive{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter to Start");
	int a = sc.nextInt();

	System.out.println("Enter to End");
	int b = sc.nextInt();
	
	for(int i = a; i <= b; i++){
	System.out.println(i);
	}
	
	sc.close();
}
}