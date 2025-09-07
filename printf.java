public class printf{
    public static void main(String[] args){
        
        // printf  = is a method used to formate the output

        // %[flages] [width][.precision][specifier-character]    

        //specified-character
        /*String = %s
         *char = %c
          int = %d
          double = %f
          boolean = %b
         */
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 20;
        double height = 181.1;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        //.precision = used for count of the nummber after decimal point
        // %.2f refers to two count of number after decimal

        // + = output a plus                                       //shows the plus symbol if positive
        // , = comma grouping separator                            // put comma in large number
        // ( = negative numbers are enclosed in ()                 // if the number is negative the num will be in bracket
        // space = display a minus if negative, space if positive  // leave the space for positive symbol with empty and minus for negative

        double price1 = 10.5;
        double price2 = 55.20;
        double price3 = 100.95;
        double price4 = 655.25;

        System.out.printf("%+.4f\n", price1);
        System.out.printf("%,.4f\n", price2);
        System.out.printf("%(.4f\n", price3);
        System.out.printf("% .4f\n", price4);


        //[width]

        // 0 = zera padding                             //number(0) visible padding "(%04d)" = 0 visible 4 digit of padding
        // number = right justified padding             //number invisible padding "(%4d)" 4 digit of padding with invisible of zero
        // negative number =  left justified padding    // the spacing will be from the right side of the number "(%-4d)"

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);


    }
}
