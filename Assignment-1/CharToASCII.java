import java.util.Scanner;
	public class CharToASCII {
		public static void mian(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre a Character : ");
		char ch = sc.next().charAt(0);

		int asciiValue = (int) ch;

		System.out.println("The ASCII Value of '"+ ch +"' is : "+asciiValue);
		sc.close();
		
		}
	} 