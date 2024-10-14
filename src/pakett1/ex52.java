package pakett1;

import java.util.Scanner;

public class ex52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        int index = name.length()-1;

        while (index >= 0) {
            System.out.println(name.charAt(index));
            index--;
        }
        scanner.close();
    }
}
