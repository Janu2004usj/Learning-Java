import java.util.Scanner;
public class forloop{
    public static void main(String[] args) throws InterruptedException{

        //This exception typicallly occurs when a thread running the method is interrupted while it is sleeping. waiting, or paused in its execution.
        // for loop = execute some code a CERTAIN amount of times

        for(int i = 0; i <= 10; i++){ //(i++ or i+=2 or i+=3 and so on )     //for(initialisation; condition; step)
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i--){ //(i-- or i-=2 or i-=3 and so on )     //for(initialisation; condition; step)
            System.out.println(i);
        }


        //get the input from the user for the "for loop"

        Scanner scanner = new Scanner(System.in);
         
        //case1 
        System.out.print("Enter how many time do you want to loop: ");
        int max = scanner.nextInt();
    
        for (int i = 1; i <= max; i++){
            System.out.println(i);
        }

        // case 2
        //Countdown timer

        System.out.print("How many seconds do you want to countdowm from?: ");
        int start = scanner.nextInt();
        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); //1000 milliseconds = 1 second // pauses the program for 1 second //(thread=class: sleep=method)
        } 
        System.out.println("Happy birthday!!!");

        scanner.close();
    }
}