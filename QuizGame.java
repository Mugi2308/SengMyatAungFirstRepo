import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        int choice=0;
        int[] right={4,1,3};
        int score=0;

        String[] questions={"Which day is a weekend day ",
                            "Which one is a vegetables",
                            "Who is the inventor of electric bulb"};

        String [][] answers={{"1.Monday","2.Tuesday","3.Friday","4.Sunday"},
                             {"1.Potato","2.Egg","3.Fish","4.Tissue"},
                             {"1.Steve Job","2.Graham bell","3.Edison","4.Einstein "}};


        System.out.println("** Welcome to the Java Quiz Game **");

        //for questions array show each line
        int a=0;

            for(String [] answer:answers) {

                System.out.println(questions[a]);
                for(String ans:answer){
                    System.out.println(ans);

                }

                System.out.print("Choose your answers :");
                choice = scanner.nextInt();
                System.out.println();

                if (choice == right[a]) {
                    System.out.println("You are right");
                    score++;
                }
                else{
                    System.out.println("Wrong choice!");
                }

                System.out.println("Your total score is "+score);
                a++;
            }

        scanner.close();
    }
}
