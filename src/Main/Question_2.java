package Main;

import java.util.Scanner;

public class Question_2 {
    private String input_string;
    private int input_index;

    public Question_2(int input_index, String input_string) {
        this.input_index = input_index;
        this.input_string = input_string;
    }

    public void setInput_string(String str) {
        input_string = str;
    }

    public int getInput_index() {
        return input_index;
    }

    public void setInput_index(int input_index) {
        this.input_index = input_index;
    }

    public String getInputs_string() {
        return input_string;
    }

    public String getsubstring() {
        String str = getInputs_string();
        int index = getInput_index();
        String substr = str.substring(index);
        return substr;
    }
}

class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String Str = scanner.nextLine().trim();
        System.out.println("Enter INDEX VALUE");
        int index = scanner.nextInt();
        Question_2 question_2 = new Question_2(index, Str);
        System.out.println("Substring is: " + question_2.getsubstring());
    }
}