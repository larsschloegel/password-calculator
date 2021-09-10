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

    public static boolean checkLowerCaseInPassword (String password){
        boolean hasLower=false;
            char [] chars = password.toCharArray();
            for(char c: chars){
                if (Character.isLowerCase(c))  {hasLower = true;}
                }
            return hasLower;
        }

    public static boolean checkUpperCaseInPassword (String password){
            boolean hasUpper=false;
            char [] chars = password.toCharArray();
            for(char c: chars){
                if (Character.isUpperCase(c))  {hasUpper = true;}
            }
            return hasUpper;
        }

    public static boolean checkAllRequirements (String password, int minNumberInPassword, int minLengthInPassword){
            return  checkNumberInPassword(password) &&
                    checkMinNumberInPassword(password,minNumberInPassword) &&
                    checkLengthOfPassword(password, minLengthInPassword) &&
                    checkLowerCaseInPassword(password) &&
                    checkUpperCaseInPassword(password);
        }




    public static void main(String[] args) {



        //System.out.println(checkNumberInPassword("krishna64", 1));
    }
}
