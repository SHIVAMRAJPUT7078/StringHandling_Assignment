package Main;

import java.util.Scanner;

public class Question_7 {
    private String str;

    public Question_7(String str) {
        this.str = str;
    }

    public Question_7() {

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int totalweight(String str) {
        char[] arr1 = str.toCharArray();
        int totalweight = 0;
        for (char c : arr1) {
            totalweight = totalweight + (int) (c);
        }
        return totalweight;
    }
}

class TestClass_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String Str = scanner.nextLine().trim();
        Question_7 question_7 = new Question_7(Str);
        System.out.println("Total weight of the string is: " + question_7.totalweight(Str));
    }
}
