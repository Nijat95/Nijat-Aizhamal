package CoddinBat;

public class bobThere {

        public boolean bobThere(String str){
            String result = " ";
            for(int i=0; i<str.length()-2; i++){
                result = str.substring(i,i+3);
                if(result.startsWith("b") && result.endsWith("b") ){
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            bobThere bob = new bobThere();
            System.out.println(bob.bobThere("abcbob"));
        }

    }

