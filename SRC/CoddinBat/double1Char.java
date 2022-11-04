package CoddinBat;

public class double1Char {

    public String doubleChar (String str){
        String result = "";
        for(int i = 0; i <str.length(); i++){
            result += str.charAt(i)+ str.substring(i,i +1);

        }
        return result;

    }
    public static void main(String [] args){
        double1Char str2 = new double1Char();
        System.out.println(str2.doubleChar("AAbb"));

    }
}
