import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        double comYear;
        double year;
        double result;

        System.out.print("Put the principle amount :");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %)");
        rate = scanner.nextDouble();

        System.out.print("Enter the no. of compound per year :");
        comYear = scanner.nextInt();

        System.out.print("No. of the year : ");
        year = scanner.nextInt();

        result = principle*Math.pow((1+(rate/100)/comYear),comYear*year);
        System.out.printf("Result is %.0f  ",result);

        scanner.close();
            
    }
}
