import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        int birthMonth;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your Birth Month: ");

        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            if ((birthMonth <= 12) && (birthMonth >= 1)) {
                System.out.print("Your birth month is: " + birthMonth);
            } else {
                System.out.print("You entered an incorrect month value: " + birthMonth);

            }
        }
        else {
                System.out.print("Invalid Input");
        }
    }
}
