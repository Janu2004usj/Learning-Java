// variable = a reusable container for a value
//            a variable behaves as if it was the value it contains

// Primitive = simple value stored directly in memory (stack)
// Reference = memory address (stack) that points to the (heap)

// Primitive   vs  Reference
// --------------------------
// int              String
// double           array
// char             object
// boolean

// two steps to creating a variable
//  1.decoration (e.g: age)
//  2.assignment (e.g: age=30)


// example of int
public class Variable{
    public static void main(String[] args){
        int age = 30;
        int year = 2025;
        int quantity = 01;
        System.out.println(age);
        System.out.println("Your age is " + age);
        System.out.println("The year is " + year);
        System.out.println("The quantity of item is " + quantity);

        System.out.println("-----------------------------------------");

        // example of double (decimal, float)
        double price = 50.00;
        double gpa = 8.46;
        double tempreature = -12.5;
        System.out.println("The price is $" + price);
        System.out.println("Your gpa is " + gpa);
        System.out.println("The tempreature is " + tempreature);

        System.out.println("-----------------------------------------");

        //example of char (single character single quotes '--')
        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println("Your grade is " + grade);
        System.out.println(symbol);
        System.out.println(currency);

        System.out.println("-----------------------------------------");

        // example of boolean (true or false)
        boolean isStudent = true;
        boolean forSales = false;
        boolean isOnline = true;

        if(isStudent){
            System.out.println("You are a student");
        }else{
            System.out.println("Your are not a student");
        }

        if(forSales){
            System.out.println("The item is for sale");
        }else{
            System.out.println("The item is not for a sale");
        }

        if(isOnline){
            System.out.println("You are in online");
        }else{
            System.out.println("Your are not in online");
        }

        System.out.println("-----------------------------------------");

        // example of String (double quotes)
        String name = "Janani";
        String food = "Pizza";
        String email = "abc123@gmail.com";
        String car = "Mustang";
        String color = "blue";

        System.out.println("Hello " + name);
        System.out.println("you are " + age + " years old");
        System.out.println("My fav food is " + food);
        System.out.println("Your mail id is " + email);
        System.out.println("My fav car is " + car);
        System.out.println("The color of the " + car + " is " + color);


    }
}


