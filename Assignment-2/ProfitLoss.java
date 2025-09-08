import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        if (sp > cp) {
            double profit = sp - cp;
            System.out.println("Seller made a Profit of: " + profit);
        } else if (cp > sp) {
            double loss = cp - sp;
            System.out.println("Seller made a Loss of: " + loss);
        } else {
            System.out.println("No Profit, No Loss.");
        }
    }
}