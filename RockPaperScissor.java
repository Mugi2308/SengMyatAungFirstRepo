
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        int score=0;
        int comChoice;
        String userSign;
        String comSign;
        String playOrNot;
        boolean play=true;


        do{
            System.out.println("Welcome to Rock & Paper & Scissor Game");
            System.out.print("Get Ready!  Choose your Sign :");
            userSign = scanner.nextLine().toLowerCase().trim(); // use trim for cut any space for user input
            comChoice = random.nextInt(1,4);
            comSign=sign(comChoice);//Invert method value into String
            System.out.println("Computer choose "+comSign);

            if(userSign.equals(comSign)){
                System.out.println("Draw !");
            }

            else if(userSign.contains("rock") && comSign.contains("scissor") ||
                    userSign.contains("paper") && comSign.contains("rock") ||
                    userSign.contains("scissor") && comSign.contains("paper")){

                System.out.println("You Win");
                score++;
            }
            else if(userSign.contains("scissor") && comSign.contains("rock") ||
                    userSign.contains("rock") && comSign.contains("paper") ||
                    userSign.contains("paper") && comSign.contains("scissor")){

                System.out.println("You lose !");

                if(score >= 0)score--; //condition for no - score
            }


            else {
                System.out.println("Invalid input ");
                continue; // restart the loop again;
            }

            System.out.println("Your Total score is :"+score);
            System.out.println("Do you want to play again Yes or No ?");
            playOrNot=scanner.nextLine().toLowerCase();

            if(playOrNot.contains("yes")){
                System.out.println();
            }
            else if(playOrNot.contains("no")){
                System.out.println("Existing...");
                play=false;
            }

            else{
                System.out.println("Invalid try again");
            }
        }while(play);

        scanner.close();
    }

  //Method for change random no.to String
    static String sign(int comChoice){
        String sign="";
        switch(comChoice){
            case 1-> sign="rock";
            case 2-> sign="paper";
            case 3-> sign="scissor";
            default -> sign="Invalid";
        };
        return sign;
    }
}
