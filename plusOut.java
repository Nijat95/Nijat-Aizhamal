public class plusOut {
    public String plusOut(String str, String word) {
        int strlength = str.length();
        int wordlength = word.length();
        String plusword = "";

        for (int i = 0; i < strlength; i++) {
            if (i <= strlength - wordlength) {
                String tmp = str.substring(i,i+wordlength);
                if (tmp.equals(word)) {
                    plusword += word;
                    i += wordlength-1;
                }
                else
                    plusword += "+";
            }
            else
                plusword += "+";
        }

        return plusword;
    }


    public static void main(String[] args) {
        plusOut plus = new plusOut();
        System.out.println(plus.plusOut("12xy34","xy"));
    }
}
