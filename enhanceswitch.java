import java.util.Scanner;
public class enhanceswitch {
    public static void main(String[] args){
        //Enhanced switch = A replacement to many else if statement
        //                   (Java14 feature)   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of week: ");
        String day = scanner.nextLine();
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's is a weekday ");
            case "Saturday", "Sunday" -> System.out.println("It's is a weekend");
            default -> System.out.println(day + " is not a day");
        }
        scanner.close();
    }
}