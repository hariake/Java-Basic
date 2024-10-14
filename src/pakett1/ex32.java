package pakett1;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int read;
        int sum = 0;


        System.out.println("Enter an integer: ");
        read = reader.nextInt();

        for (int i = 1; i <= read; i++,sum += i) {
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
