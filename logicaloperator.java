import java.util.Scanner;
public class logicaloperator {
    public static void main(String[] args){
        
        // && = AND (all conditions are true)
        // || = OR  (any one condition is true is enough)
        // !  = NOT (the operator to check the condition is false)

        //example one
        Scanner scanner = new Scanner(System.in);

        double temp;
        boolean isSunny;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        System.out.print("The weather is sunny or not? say true or false: ");
        isSunny = scanner.nextBoolean();

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is Good !");
            System.out.println("It is Sunny outside !");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is Good !");
            System.out.println("It is Cloudy outside");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad");
        }


        //example two

        // usrname must be between 4-12 characters
        // username must not contain spaces or underscores
        
        String username;

        System.out.println("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }
        scanner.close();
    }
}
