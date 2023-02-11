public class BirthMonth {
    public static void main(String[] args) {//enter your birth month
        int birthMonth = 10;

        if (birthMonth >= 1 && birthMonth <= 12) {// Birth month has to be between 1 and 12
            System.out.println("Your birth month is: " + birthMonth);// output enter your birth month
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);//output invalid birth month
        }
    }
}
