package pakett1;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first;
        int second;
        int sum = 0;


        System.out.println("Enter the first integer: ");
        first = reader.nextInt();

        System.out.println("Enter the second integer: ");
        second = reader.nextInt();

        for (int i = first; i <= second; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);

    }
}
