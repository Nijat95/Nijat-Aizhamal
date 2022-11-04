public class xyzMiddle {

    public boolean xyzMiddle(String str) {
        String xyz = "xyz";
        int length = str.length();
        int middle = length / 2;

        if (length < 3)
            return false;

        if (length % 2 != 0) {
            if (xyz.equals(str.substring(middle-1,middle+2))) {
                return true;
            } else {
                return false;
            }
        } else if (xyz.equals(str.substring(middle-1,middle+2)) ||
                xyz.equals(str.substring(middle-2,middle+1))) {
            return true;
        } else
            return false;
    }



    public static void main(String[] args) {
        xyzMiddle xyz = new xyzMiddle();
        System.out.println(xyz.xyzMiddle("AAxyzBB"));
    }
}
