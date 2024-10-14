package pakett1;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.print("Type the first number: ");
        read = reader.nextInt();
        sum += read;

        System.out.print("Type the second number: ");
        read = reader.nextInt();
        sum += read;

        System.out.print("Type the third number: ");
        read = reader.nextInt();
        sum += read;

        System.out.println("The sum is: " + sum);
    }
}
