package Main;

import java.util.Scanner;

public class Question_11 {
    private char ch;
    private String inputString;

    public Question_11(char ch, String inputString) {
        this.ch = ch;
        this.inputString = inputString;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public void getAllIndex() {
        char[] arr = getInputString().toCharArray();
        char ch = getCh();
        int i = 0;
        for (char c : arr) {
            if (c == ch) {
                System.out.println(i);
            }
            i++;
        }
    }
}

class TestClass_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scanner.nextLine().trim();
        System.out.println("Enter character");
        char ch = scanner.nextLine().charAt(0);
        Question_11 question_11 = new Question_11(ch, str);
        question_11.getAllIndex();
    }
}