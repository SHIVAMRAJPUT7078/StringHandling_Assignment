package Main;

import java.util.Scanner;

public class Question_10 {
    private char ch;
    private String inputString;

    public Question_10(char ch, String inputString) {
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

    public int getIndex() {
        int index = getInputString().indexOf(getCh());
        return index;
    }
}

class TestClass_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.nextLine().charAt(0);
        String string = scanner.nextLine().trim();
        Question_10 question_10 = new Question_10(ch, string);
        System.out.println(question_10.getIndex());
    }
}
