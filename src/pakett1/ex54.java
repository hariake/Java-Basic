package pakett1;

import java.util.Scanner;

public class ex54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scanner.nextLine();

        System.out.println("length of the last part: ");
        int length = scanner.nextInt();

        System.out.println(word.substring(word.length() - length));

        scanner.close();
    }

}
