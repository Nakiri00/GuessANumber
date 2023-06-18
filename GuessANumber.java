package guessanumber;
import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    static int actNumber, gssNumber, range, choices,yn;
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Please enter the max value of the number between 0 to 100: ");
        range = in.nextInt();
        while (range < 0 || range > 100){
            System.out.println("Read the instruction properly, try again");
            System.out.print("Please enter the max value of the number between 0 to 100: ");
            range = in.nextInt();
        }
        actNumber = random.nextInt(range);
        System.out.println("====================");
        System.out.println("1 for start");
        System.out.println("2 for hint");
        System.out.println("3 for exit");
        System.out.print("your choice : ");
        choices = in.nextInt();
        System.out.println("");
        while(choices < 1 || choices > 3 ){
            System.out.println("Read the instruction properly, try again");
            System.out.println("====================");
            System.out.println("1 for start");
            System.out.println("2 for hint");
            System.out.println("3 for exit");
            System.out.print("your choice : ");
            choices = in.nextInt();
            System.out.println("");
        }
        while(choices != 3){
            if(choices == 1){
                System.out.print("Your guess : ");
                gssNumber = in.nextInt();
                while(gssNumber != actNumber){
                    if(gssNumber < actNumber){
                        System.out.println("Too Low");
                        System.out.print("Guess again : ");
                        gssNumber = in.nextInt();
                    }else if(gssNumber > actNumber){
                        System.out.println("Too High");
                        System.out.print("Guess again : ");
                        gssNumber = in.nextInt();
                    }
                }
                if(gssNumber == actNumber){
                    System.out.println("That's Right");
                    System.out.println("=================");
                    System.out.println("Wanna guess again");
                    System.out.println("1 for yes");
                    System.out.println("2 for no");
                    System.out.print("[1/2] : ");
                    yn = in.nextInt();
                    while(yn < 1 || yn > 2){
                        System.out.println("...Try again");
                        System.out.println("=================");
                        System.out.println("Wanna guess again");
                        System.out.println("1 for yes");
                        System.out.println("2 for no");
                        System.out.print("[1/2] : ");
                        yn = in.nextInt();
                    }
                    if(yn == 1){
                        System.out.print("Please enter the max value of the number between 0 to 100: ");
                        range = in.nextInt();
                        while (range < 0 || range > 100){
                            System.out.println("Read the instruction properly, try again");
                            System.out.print("Please enter the max value of the number between 0 to 100: ");
                            range = in.nextInt();
                        }
                        actNumber = random.nextInt(range);
                        System.out.println("====================");
                        System.out.println("1 for start");
                        System.out.println("2 for hint");
                        System.out.println("3 for exit");
                        System.out.print("your choice : ");
                        choices = in.nextInt();
                        System.out.println("");
                    }else{
                        choices = 3;
                    }    

                }
                
            }else if(choices == 2){
                System.out.println("============================");
                if(actNumber >= 1 && actNumber <= 25){
                    System.out.println("Actual Number Between 1 - 25");
                }else if(actNumber >= 26 && actNumber <= 50){
                    System.out.println("Actual Number Between 26 - 50");
                }else if(actNumber >= 51 && actNumber <= 75){
                    System.out.println("Actual Number Between 51 - 75");
                }else if(actNumber >= 76 && actNumber <= 100){
                    System.out.println("Actual Number Between 76 - 100");
                }
                System.out.println("============================");
                System.out.println("1 for start");
                System.out.println("2 for hint");
                System.out.println("3 for exit");
                System.out.print("your choice : ");
                choices = in.nextInt();
                System.out.println("");
            } 
            
       }
        
    }
    
}
