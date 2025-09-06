import java.util.Random; //To get random of anything we should import the random package
public class randomnumber {
    public static void main(String[] args){
         
        Random random = new Random();
        // random in int
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1,7);  //(inclusive, exclusive) inclusive = included, exclusive = not included
        number2 = random.nextInt(1,7);
        number3 = random.nextInt(1,7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


        //randon in double

        double number; //this will pritn the number in decimal between 0 and 1

        number = random.nextDouble();
        System.out.println(number);

        //random in boolean

        boolean isHead;
        isHead = random.nextBoolean();

        if(isHead){
            System.out.println("true=Heads");
        }
        else{
            System.out.println("false=Tails");
        }
    }
}
