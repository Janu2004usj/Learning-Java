import java.util.Scanner;  //Scanner(class) used to get the input
public class userinput{
    public static void main(String[] args){
        

      // these are the initial value to calculate the area of rectangle should write before class Scanner line
             double width = 0;
             double height = 0;
             double area = 0;

            
             Scanner scanner = new Scanner(System.in); //Scanner = class, scanner = object // this line is used to get the input by importing the package scanner
             System.out.print("Enter your name:");  //instead "print" we can also use "println" but it types the text in next line
             String name = scanner.nextLine();   //this line is used to get th output // instead "nextline" we can also use "next" which prints the text only before the space 

             System.out.print("Enter your age:");
             int age = scanner.nextInt();

             System.out.print("Enter your gpa:");
             double gpa = scanner.nextDouble();

             System.out.println("Are you a student? (true/false): ");
             boolean isStudent = scanner.nextBoolean();
  
             System.out.println("Hello " + name);
             System.out.println("you are " + age + " years old");
             System.out.println("your gpa is:" + gpa);
             System.out.println("Student: " + isStudent);

             if(isStudent){
                System.out.println("Your are a student");
             }
             else{
                System.out.println("you are not a student");
             }


             
             //common issues
             // the common issues is when a string is used after the int or double we are not able to get the input of string  
             System.out.print("Enter your age:");
             int aage =  scanner.nextInt();
             scanner.nextLine();  //this line will help to print the proper code line by line

             System.out.print("Enter you favorite color:");
             String colour = scanner.nextLine();

             System.out.println("Your are " + aage + " years old");
             System.out.println("Your favorite color is " + colour);


             //calculate the area of the rectangle by getting the input 
             System.out.print("Enter the value of width:");
             width = scanner.nextDouble(); // no need to mention the datatype double beacause we initially mentioned it at the top of the code
             System.out.print("Enter the value of height:");
             height = scanner.nextDouble();

             area = width * height;
             System.out.println("The area of the rectangle is " + area + " cm^2");



             scanner.close(); //this line is closing the scanner object (important line)


    }
}

