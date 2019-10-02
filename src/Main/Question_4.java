package Main;

import java.util.Scanner;

public class Question_4 {
    private String string;

    public Question_4(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public String replacestringAccordingtoUccurance(){
        StringBuilder sb = new StringBuilder();
        char[] arr = getString().toCharArray();
        for (char c : arr) {

            if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')){
                int i = 1;
                if(i%2==0){
                    sb.append('^');
                    i =i++;
                }
                else if(i%4==0){
                    sb.append('!');
                    i =i++;
                }
                else{
                    sb.append('*');
                    i =i++;
                }

            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

class TestClass4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Str = scanner.nextLine().trim();
        Question_4 question_4 = new Question_4(Str);
        System.out.println(question_4.replacestringAccordingtoUccurance());
    }
}