import java.util.Scanner;
public class compoundinterestcalculator {
    public static void main(String[] args){
            
        Scanner scanner = new Scanner(System.in);

        double principal;  // amount we use as interest
        double rate;
        int timesCompounded; // we put daily, weekly, or monthly
        int years; // we put yearly
        double amount;

        System.out.print("Enter the principal amount:");
        principal = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;  //we use divided by 100 here because the datatype of the rate is double 
        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d is: $%.2f" , years , amount);

        scanner.close();
    }
}
