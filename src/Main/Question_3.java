package Main;

import java.util.Scanner;

public class Question_3 {
    private String string;

    public Question_3(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public String replacestring(){
        StringBuilder sb = new StringBuilder();
        char[] arr = getString().toCharArray();
        for (char c : arr) {
            if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')){
                sb.append('*');
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

class TestClass3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String Str = scanner.nextLine().trim();
        Question_3 question_3 = new Question_3(Str);
        System.out.println("String after repacement is :"+question_3.replacestring());
    }
}
