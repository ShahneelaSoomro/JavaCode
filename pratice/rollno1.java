//RollNO: 25CS012

import java.util.Scanner;

public class rollno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name of University:");
        String uniName = sc.nextLine();

        System.out.println("Enter the Name of Department:");
        String deptName = sc.nextLine();

        System.out.println("Enter the Number of Students:");
        int quantity = sc.nextInt();

        System.out.println("\nUniversity: " + uniName);
        System.out.println("Department: " + deptName);
        System.out.println("\nStudent Roll Numbers are:");

        for (int i = 1; i <= quantity; i++) {
            System.out.println("25CS0" + i);
        }

        sc.close();
    }
}
