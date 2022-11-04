package CoddinBat;

public class repeatEnd {

    public String repeatEnd(String str, int n) {
        int len = str.length();
        String newWord = "";

        for (int i = 0; i < n; i++) {
            newWord += str.substring(len - n, len);
        }
        return newWord;
    }


    public static void main(String[] args) {
        repeatEnd repeat = new repeatEnd();
        System.out.println(repeat.repeatEnd("Hello",3));
    }
}


