import java.util.Scanner;
public class temperatureconvertor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //getting the inputs 
        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature: "); //getting input of temperature
        temp = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): "); //need in celsius or fahrenheit ?
        unit = scanner.next().toUpperCase();  //making that unit in uppercase
        
        newtemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32; //is unit in celsius then 1st condition exist ortherwise 2nd condition will exist
        System.out.printf("%.2f°%s" , newtemp, unit);   //temp in degree with unit

        scanner.close();
    }
}
