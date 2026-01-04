import java.util.Scanner;
import java.util.Random;
public class DiceProgram {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int roll;
        int noOfDice;
        int totalOfDice=0;

        System.out.print("How many time do you want to dice? :");
        noOfDice = scanner.nextInt();

        for(int i =0 ; i < noOfDice ; i++){
            roll=random.nextInt(1,7);
            System.out.println(roll);

            Dice(roll);

            totalOfDice+=roll;
        }
        System.out.println("Total dice sum is = "+totalOfDice);

        scanner.close();
    }

    static void Dice(int roll){

        String dice1= """
                 ___
                |   |
                | * |
                |   |
                 ___
                """;

        String dice2= """
                 ___
                | * |
                |   |
                | * |
                 ---
                """;

        String dice3= """
                 ___
                | * |
                | * |
                | * |
                 ---
                """;

        String dice4= """
                 ___
                |* *|
                |   |
                |* *|
                 ---
                """;

        String dice5= """
                 ___
                |* *|
                | * |
                |* *|
                 ---
                """;

        String dice6= """
                 ___
                |* *|
                |* *|
                |* *|
                 ---
                """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);

            default -> System.out.println("Invalid");
        }
    }
}


