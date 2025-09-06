public class arithmetic{
    public static void main(String[] args){
        int x = 10;
        int y = 2;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        z = x % y;
        
        System.out.println(z);

        //Augmented assignment operator
        // Augmented is storing the operator values in the variable itself 
        int a = 20;
        int b = 10;

        //a += b;  //this line refers to a = a + b; which add the value of a and b and again stores the new value in the a variable
        //a -= b;
        //a *= b;
        //a /= b;
        a %= b;

        System.out.println(a);

        //Icrement and Decrement operator

        int q = 10;
        int s = 20;

        q++; //icrementing the value of q (q = q + 1;)
        s--; //decrementing the value of s (s = s -1;)

        System.out.println(q);
        System.out.println(s);

        // Order of operators [P-E-M-D-A-S]
        /*P-parentheses
         *E-exponents
          M-multiplication 
          D-division
          A-addittion
          S-subtraction
         */

         double result = 3 + 4 * (7 - 5) / 2.0; // slove by using the PEMDAS order
                       /*3 + 4 * 2 / 2.0  //slove parentheses
                                          // no exponent 
                        *3 + 8 / 2.0      //slove multiplication       
                         3 + 4            //slove division
                         7                //slove addition
                                          //no subtraction
                        */
                     

         System.out.println(result);
    }
}