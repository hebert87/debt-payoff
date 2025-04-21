import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()) {
            String name = scan.nextLine();
            if(name.isBlank()) {
                break;
            }
            
            float apr = scan.nextFloat();
            float balance = scan.nextFloat();

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }
    }
}
