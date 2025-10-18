public class breakandcontinue {
    public static void main(String[] args) {

        //break = break out of a loop (STOP)
        //countinue = skip current iteration of a loop (SKIP)

        //case 1: break
        for(int i = 0; i < 10; i++){

            if(i == 5){
                break;
            }
            System.out.print(i + " "); /* this will print the itration next to next not in 
                                       the next line because of the System.out.print and
                                       + " " this will the space between the itrations  */   
           }

        //case 2: continue
        for(int i = 0; i < 10; i++){

            if(i == 5){
                continue;
            }
            System.out.println(i + " "); 

           }
    }

}
