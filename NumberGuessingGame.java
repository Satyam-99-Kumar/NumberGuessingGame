import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
    public static void main(String[] args) {
        Random Random_number= new Random();
        int right_guess=Random_number.nextInt(100);
        int turns=0;
        String name;
        Scanner scan=new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("          NUMBER GUESSING GAME ");
        System.out.println("----------------------------------------");
        System.out.println("ENTER YOUR NAME :");
        name=scan.nextLine();
        System.out.println("WELCOME "+name);
        System.out.println(" \nGUESS A NUMBER BETWEEN ( 1 TO 100 )" );
        System.out.println(" YOU WILL GET ONLY 10 CHANCE\n" );
        System.out.println("BEST OF LUCK "+name);
        System.out.println("----------------------------------------");

        int guess;
        int i=0;
        boolean win=false;
        while(win==false) {
            System.out.print("\nENTER YOUR NUMBER : ");
            guess=scan.nextInt();
            turns++;

            if(guess==right_guess) {
                win=true;
            }
            else if(i>8){
                System.out.println("You loose! the right answer was: "+right_guess);
                return;
            }
            else if(guess<right_guess){
                i++;
                System.out.println("Number is greater than "+ guess +"       TURNS LEFT: "+(10-i));



            }
            else if(guess>right_guess) {
                i++;
                System.out.println("number is smaller than "+ guess +"        TURNS LEFT: "+(10-i));

            }



        }
        System.out.println("-----------------------------------------------\n");
        System.out.println("CONGRATULATIONS "+name);
        System.out.println("YOU HAVE WON THE GAME");
        System.out.println("YOU CORRECTLY GUESS THE NUMBER  "+right_guess);
        System.out.println("\nYou used "+turns+" turns to guess the right number");
        System.out.println("\n YOUR SCORE IS "+((11-turns)*10)+" OUT OF 100");
        System.out.println("------------------------------------------------");


    }
}
