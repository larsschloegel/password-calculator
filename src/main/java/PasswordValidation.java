import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PasswordValidation {

    public static boolean checkLengthOfPassword (String password, int minLengthPassword){
        return password.length() >= minLengthPassword;
    }

    public static boolean checkMinNumberInPassword (String password, int minNumberInPassword){
        int countnumber = 0;
        char [] chars = password.toCharArray();
        for(char c: chars){
            if(Character.isDigit(c)){
                countnumber = countnumber +1;
            }
        }
        if (countnumber>=minNumberInPassword){
            return true;
        } else return false;
    }

    public static boolean checkNumberInPassword (String password){
        return password.matches(".*\\d.*");
    }

    public static boolean checkLowerAndUpperInPassword (String password){
        boolean hasLower=false;
        boolean hasUpper= false;
        char [] chars = password.toCharArray();
        for(char c: chars){
            if (Character.isLowerCase(c))  {hasLower = true;}
            if (Character.isUpperCase(c)) {hasUpper = true;}
            }
        return hasLower==true && hasUpper==true;
        }


    public static void main(String[] args) {



        //System.out.println(checkNumberInPassword("krishna64", 1));
    }
}
