package jv2_190520_session1;

import java.util.HashSet;
import java.util.Scanner;

public class ConsoleStudent {
    HashSet<String> Student = new HashSet<>();

    public void add() {
        if (Student.size() == 10) {
            print();
        } else {
            System.out.println("Please insert number: ");
            Scanner scanner = new Scanner(System.in);
            Student.add(scanner.nextLine());
        }
    }

    public void print() {
        for (String s : Student) {
            System.out.println(s);
        }
    }
}
