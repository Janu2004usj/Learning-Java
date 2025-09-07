import java.util.Scanner;
public class substring {
    public static void main(String[] args){

        // .substring() = A method used to extract a portion of a string
        //                string.substring(start, end)  // this will starts creating a new string is called substring

         Scanner scanner = new Scanner(System.in);

         String email;
         String username;
         String domain;

         System.out.println("Enter your email: ");
         email = scanner.nextLine();

         username = email.substring(0,email.indexOf("@")); //the substring will get the email as username from 0th index to before the @ symbol
         domain = email.substring(email.indexOf("@") + 1); // this line will get the domain after the @ symbol // that + 1 will remove the @ symbol

         System.out.println(username);
         System.out.println(domain);

         scanner.close();

    }
}
