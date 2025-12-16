import java.util.Random;
import java.util.Scanner;

public class JavaMiniGame {

    //static variable
    static String monster="";
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int choice=0;
    static int runAndAttack=0;
    static int strength=0;
    static int damage=0;
    static int goodBad=0;
    static int life=2;
    static boolean run=false;


    public static void main(String[] args){



        //choice for left and right looping
        do {
            System.out.println("**************************");
            System.out.println("Welcome to a Jungle Game !");
            System.out.println("**************************");
            System.out.println("Where do you want to go left or right ?");
            System.out.println("1.Go left <----");
            System.out.println("2.Go right ---->");
            System.out.print("Choose your path : ");
            choice = scanner.nextInt();
            scanner.nextLine();//buffer clear

            if (choice == 1) {
                System.out.println("You are entering the wood");
                goodBad = random.nextInt(1, 2 + 1);
                if (goodBad == 1) {
                    System.out.println("You got lucky u meet with a Tiger 🐯🐯");
                    strength = random.nextInt(8, 10 + 1);
                    monster = "Tiger";
                } else {
                    System.out.println("Too bad u meet with Jungle King Lion !🦁🦁");
                    strength = random.nextInt(9, 13 + 1);
                    monster = "Jungle King Lion";
                }
            } else if (choice == 2) {
                System.out.println("You are entering to the long dark cave.🗿🗿");
                goodBad = random.nextInt(1, 3 + 1);
                if (goodBad == 1) {
                    System.out.println("Not too bad for ya you meet with an Orc👾👾");
                    strength = random.nextInt(5, 10 + 1);
                    monster = "An Orc";
                } else if (goodBad == 2) {
                    System.out.println("Steady ! Get a hold yourself for big battle you meet a Demon!😈");
                    strength = random.nextInt(8, 10 + 1);
                    monster = "A Demon";
                } else {
                    System.out.println("Better run this time! You are facing a Demon Lord !!!😈👑❗");
                    strength = random.nextInt(10, 15 + 1);
                    monster = "A Demon Lord !";
                }
            }
            else {
                System.out.println("Invalid choice ! choice again \n");
            }
        }while(choice>2);


        //condition for still alive or dead
        while(strength>0 && life>=0) {
            displayMethod();

            if (runAndAttack == 1) {
                runMethod();
                run=true;//use boolean for outer loop statement
                break;
            }
            else {
                attackMethod();
            }
            life--;//after a choice lose 1 life
        }

        //after looping statement
        if(strength<=0){
            System.out.println("Congratulation you defeat "+monster);
        }
        //for runMethod after breaking the loop
        else if(run){
            System.out.println("_________________________");
        }
        //if strength <0 so it mean player dead
        else
        {
            System.out.println("You are defeated by "+monster);
        }
            scanner.close();
    }
    static void runMethod(){
        System.out.println("You tried to run !");
        int run=random.nextInt(1,2+1);
        if(run==1){
            System.out.println("Lucky you over run this "+monster+" and escape !");
        }
        else{
            System.out.println("While you are running you tripped and the "+monster+" eat you alive !!!");
            System.out.println("And You Died !💀💀 ");
        }
    }

    static void displayMethod(){
        System.out.printf("And the %s Strength is : %d 🛡️🛡️\n", monster, strength);
        System.out.println("Do you want to fight or run");
        System.out.println("1.Run 🏃‍♀️‍➡️🏃‍➡️");
        System.out.print("2.Attack !⚔️ :");
        runAndAttack=scanner.nextInt();
        scanner.nextLine();//buffer clear
    }

    static void attackMethod(){
                damage =random.nextInt(3,10);//damage 3 to 10
                strength -= damage;
                System.out.println("You attacked " + monster + " whit " + damage + " damage!");
                System.out.println(monster + " have " + strength + " strength left.");
                System.out.println("life ="+life+"\n");

    }

}
