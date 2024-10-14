package pakett1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class student2 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("What is the students name?: ");
            String name = sc.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("What is the students number?: ");
            String number = sc.nextLine();

            Student student = new Student(name, number);
            list.add(student);
        }
        System.out.println();
        for (Student student : list) {
            System.out.println(student);
        }
        sc.close();
    }
}