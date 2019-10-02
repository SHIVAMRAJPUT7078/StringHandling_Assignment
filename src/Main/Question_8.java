package Main;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String Str = scanner.nextLine().trim();
        String Str1 = Str.toUpperCase();
        Question_7 question_7 = new Question_7(Str1);
        System.out.println("Total weight in Upper cas is ; " + question_7.totalweight());
    }
}
