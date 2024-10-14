package pakett1;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int read;


        System.out.println("Enter an integer: ");
        read = reader.nextInt();

        for (int i = 1; i <= read; i++) {
            System.out.println(i);
        }
    }
}
