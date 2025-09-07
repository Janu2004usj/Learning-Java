
// nested if statement means the statement should satisfy all the if conditions 
public class nestedifstatement {
    public static void main(String[] args){
         boolean isStudent = false;
         boolean isSenior = true;
         double price = 9.99;

         if(isStudent){ // if student 
            if(isSenior){ // if student and senior
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else{  // if student and not a senior
                System.out.println("You geta student discount od 10%");
                price *= 0.9;
            }
            
         }
         else{ // if senior and not a student
            if(isSenior){
                System.out.println("Your get a senior discount of 20%");
                price *= 0.8;
            }
            else{ // not both student and senior
                price *= 1;
            }
            
         }

         System.out.printf("The price of a ticket is: $%.2f" , price);
    }

}
