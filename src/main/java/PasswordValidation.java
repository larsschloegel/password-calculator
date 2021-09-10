import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PasswordValidation {

    public static boolean checkLengthOfPassword (String password, int minLengthPassword){
        boolean lenghtPasswordCheck = false;
        if (password.length() >= minLengthPassword ) {
            lenghtPasswordCheck = true;
        }
        return lenghtPasswordCheck;
    }

    public static boolean checkNumberInPassword (String password, int minNumberInPassword){
        int countnumber = 0;
        char [] chars = password.toCharArray();
        for(char c: chars){
            if(Character.isDigit(c)){
                countnumber = countnumber +1;
            }
        }
        if (countnumber==minNumberInPassword){
            return true;
        } else return false;
        //System.out.println(sb);
    }

    public static void main(String[] args) {
        /*String password = "krishna64";
        int countnumber = 0;
        char [] chars = password.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c: chars){
            if(Character.isDigit(c)){
                sb.append(c);
                countnumber = countnumber + 1;
                System.out.println(countnumber);
            }
        }
        System.out.println(sb);*/
        System.out.println(checkNumberInPassword("krishna64", 1));

    }
}
