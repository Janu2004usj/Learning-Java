import java.util.Scanner;
public class Mathclass {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Common class in Math
        System.out.println(Math.PI); //PI=value of pi
        System.out.println(Math.E); //E=eulers number

        double result;
        
        result = Math.pow(2,5 ); //2 power 5 is 32
        result = Math.abs(-5); //give the absolute value and omit the negative sign
        result = Math.sqrt(9); //square root value of 9
        result = Math.round(3.14); //round the number
        result = Math.ceil(3.14);  // round the number upward
        result = Math.floor(3.14); //round the number downward
        result = Math.max(5,6); //print the maximum value
        result = Math.min(5,6); //print the minimum value

        System.out.println(result);

        //Hypotenuse c=Math.sqrt(a^2 + b^2);

        double a;
        double b;
        double c;

        System.out.print("Enter the value of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the value of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("the Hypotenuse side of 'c' is " + c + "cm" );


        //circumference = 2 * Math.PI * radius;
        //area = Math.PI * Math.pow(radius, 2);
        //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius:");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius , 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm^2\n ", area);
        System.out.printf("The volume is: %.1fcm^3\n" , volume );

        scanner.close();
    }
    
}
