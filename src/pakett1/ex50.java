package pakett1;

import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?:");
        String name = scanner.nextLine();

        if (name.length() >= 3)  {
            System.out.println("first character: " + name.charAt(0));
            System.out.println("second character: " + name.charAt(1));
            System.out.println("third character: " + name.charAt(2));
        }
        scanner.close();
    }
}
