import java.util.Random;
import java.util.Scanner;

public class MiniSlothJava {

    public static void main(String[] args){


        int balance=100;
        int bet;
        int payout;
        String[] roll;
        String playAgain;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Java Mini sloth game");
        System.out.println("**** 🦄 🐔 🐂 🎯 🐷 ****");

        while(balance>0){
                System.out.print("Place a bet $:");
                bet = scanner.nextInt();
                scanner.nextLine();// buffer clear

                if(bet > 0){
                    System.out.println("You bet");
                    balance-=bet;
                }
                else
                {
                    System.out.println("You must bet grater than 0 ");
                }
                System.out.println("Spinning ....");

                roll=spin();
                printRoll(roll);
                payout=getPayout(roll,bet);

                if(payout>0){
                    System.out.println("You win !! "+bet+"$");
                    balance+=bet;
                }
                else {
                    System.out.println("You lose!");
                }

            System.out.println("Current balance :"+balance);

            System.out.println("Do you want to play again Y/N ?");
            playAgain=scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
               break;
            }
        }
        System.out.println("Game Over! Your last balance is "+balance);


        scanner.close();
    }

    static String[] spin(){

        String[] dolls = {"🦄", "🐔", "🐂", "🎯", "🐷"};
        String[] roll =new String[3];
        Random random = new Random();

        for(int i=0; roll.length > i ; i++){
            roll[i]= dolls[random.nextInt(dolls.length)];
        }

        return roll;
    }
    static void printRoll(String[] roll){
        //System.out.println(roll[0] + roll[1]+ roll[2]);

        System.out.println(" "+ String.join(" | ", roll));
    }
    static int getPayout(String[] roll,int bet){
        if(roll[0].equals(roll[1]) && roll[1].equals(roll[2])){
            return switch(roll[0]){
                case "🐷" -> bet *3;
                case "🐔" -> bet *4;
                case "🎯" -> bet *5;
                case "🐂" -> bet *7;
                case "🦄" -> bet *10;
                default -> 0;
            };
        }
        else if(roll[0].equals(roll[1])) {
            return switch (roll[0]) {
                case "🐷" -> bet * 2;
                case "🐔" -> bet * 3;
                case "🎯" -> bet * 4;
                case "🐂" -> bet * 5;
                case "🦄" -> bet * 7;
                default -> 0;
            };
        }
            else if(roll[1].equals(roll[2])) {
            return switch (roll[1]) {
                case "🐷" -> bet * 2;
                case "🐔" -> bet * 3;
                case "🎯" -> bet * 4;
                case "🐂" -> bet * 5;
                case "🦄" -> bet * 7;
                default -> 0;
            };

        }
            else {
                bet=0;
        }

        return bet;
    }

}
