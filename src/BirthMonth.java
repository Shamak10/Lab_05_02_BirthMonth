import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your birth month (1-12): ");// output enter your birth month
        int birthMonth = (10);

        if (birthMonth >= 1 && birthMonth <= 12) {// birth month has to between 1 and 12
            System.out.println("Your birth month is: " + birthMonth);// output you get the correct birth month
        } else {
            System.out.println("You entered an invalid month value: " + birthMonth);//output invalid birth month
        }
    }
}
