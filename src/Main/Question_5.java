package Main;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String Str = scanner.nextLine().trim();
        System.out.println("Enter a Substring");
        String substring = scanner.nextLine().trim();
        System.out.println("Enter a PATTERN FOR REPLACEMENT");
        String pattern = scanner.nextLine().trim();
        System.out.println(Str.replace(substring,pattern));
    }
}
