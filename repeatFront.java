public class repeatFront {
    public String repeatFront(String str, int n) {
        String newString = "";

        for (int i = n; n > 0; n--){
            newString += str.substring(0,n);
        }
        return newString;
    }

    public static void main(String[] args) {
        repeatFront re = new repeatFront();
        System.out.println(re.repeatFront("Chocole",3));
    }
}
