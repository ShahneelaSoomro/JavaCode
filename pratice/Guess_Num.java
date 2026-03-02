import java.util.Scanner;

public class Guess_Num {
    public static void main(String[] args) {

        int low = 99;
        int high = 200;
        int num;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Number ---");
            num = sc.nextInt();

            if (num > high) {
                System.out.println("Your Number is too High");
            } else if (num < low) {
                System.out.println("Your Number is too Low");
            } else {
                System.out.println("Correct Range! Game Over.");
                break; // loop stops here
            }
        }

        sc.close();
    }
}
