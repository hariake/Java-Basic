package pakett1;

import java.util.Scanner;

public class ex53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scanner.nextLine();

        System.out.println("length of the first part: ");
        int length = scanner.nextInt();

        System.out.println(word.substring(0, length));

        scanner.close();
    }

}
