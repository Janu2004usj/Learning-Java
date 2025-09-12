import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){

        // while loop = repeat some code forever
        //              while some condition remoins true

        Scanner scanner = new Scanner(System.in);

        //example one
        String name = "";

        while(name.isEmpty()){  // instead while we can also use if but when we use if without inter the name th hello will work so avoid that we use the while loop
            System.out.print("Enter your name: ");
            name = scanner .nextLine();
        }
        System.out.println("Hello " + name);
        

        //example two
        String response = "";
        while(!response. equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You have quit the game");
        
        // example three
        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age can't be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old");

        // example four
        // do while loop is littlebit different from the while loop 
        // do while loop first run the last code and then come to the while contions
        int agee = 0;

        System.out.print("Enter your age: ");
        agee = scanner.nextInt();

        do{
            System.out.println("Your age can't be negative");
            System.out.println("Enter your age: ");
            agee = scanner.nextInt();
        }while(agee < 0);

        System.out.println("You are " + agee + " years old");

        //example five
        int number = 0;
         
        do{
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked " + number);
        scanner.close();
    }
}
 