public class endOther {
    public boolean endOther(String a, String b) {
        if(a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        endOther end = new endOther();
        System.out.println(end.endOther("Hiabc","abc"));
    }
}
