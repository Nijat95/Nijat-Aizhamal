public class repeatFront {
    public String repeatFront(String str, int n) {
        String newString = "";

        while (n > 0){
            newString += str.substring(0,n);
            n--;
        }
        return newString;
    }

    public static void main(String[] args) {
        repeatFront re = new repeatFront();
        System.out.println(re.repeatFront("Chocole",3));
    }
}
