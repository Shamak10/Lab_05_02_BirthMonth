import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your birth month (1-12): 10 ");//Output enter your birth month
        int birthMonth = scan.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12) {// birth month has to be between 1 and 12
            System.out.println("Your birth month is: " + birthMonth);//Output you will get your birth month
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);// output invalid birth month value
        }
    }
}
