package Main;

import java.util.Scanner;

public class Question_9 {
    private String str;
    private int absolute_wt;

    public Question_9(String str) {
        this.str = str;
        this.absolute_wt = getAbsolute_wt();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getAbsolute_wt() {
        return absolute_wt;
    }

    public void setAbsolute_wt(int absolute_wt) {
        this.absolute_wt = absolute_wt;
    }

    public int absoluteWeght(String str1) {
        String str = str1;
        String upperstr = str.toUpperCase();
        Question_7 question_7 = new Question_7();
        int lowerweight = question_7.totalweight(str);
        int upperweight = question_7.totalweight(upperstr);
        return (upperweight - lowerweight);

    }
}

class TestClass_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        Question_9 question_9 = new Question_9(str);
        System.out.println("absolute weight of the string  is : " + Math.abs(question_9.absoluteWeght(str)));
    }
}