import java.util.Scanner;
public class ifstatement {
    public static void main(String[] args){
        // if statements  = performs a block of code if its condition is true 
        Scanner scanner = new Scanner (System.in);
        

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();


        boolean isStudent;
        System.out.print("Are you a student (true/false)?");
        isStudent = scanner.nextBoolean();

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
       
        
        //Group 1

        if(name.isEmpty()){
            System.out.println("Your ddn't enter you name 😡");
        }
        else{
            System.out.println("hello " + name + "! 😊");
        }

        //Group 3
        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student");
        }

        //Group 2
         if(age >= 18 && age <=30){
            System.out.println("You are an adult!");
         }
         else if(age >=65){
            System.out.println("You are a senior !");
         }
         else if(age < 0){
            System.out.println("you haven't been born yet !");
         }
         else if(age == 0){
            System.out.println("You are born just now!");
         }
         else{
            System.out.println("You are a child!");
         }

         scanner.close();

    }
    
}
