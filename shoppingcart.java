import java.util.Scanner;
public class shoppingcart {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        String item;
        double price;
        int quantity;
        double total;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price of each? ");
        price = scanner.nextDouble();

        System.out.print("How amny item iteam would you like to buy?");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\n You have brought " + quantity + " " + item + "/s");
        System.out.println("The total price of the items is $" + total);

        scanner.close();

    }
    
}
