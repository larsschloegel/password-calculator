import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
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

        public static String createOneRandomPassword (int lengthRandomPassword){
            List<String> password = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "p", "r",
                    "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P",
                    "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9");
            String onePassword ="";
            for (int i = 0; i < lengthRandomPassword; i++) {
                onePassword += password.get(new Random().nextInt(password.size()));
            }
            return onePassword;
        }
        public static String[] createMultiplePassword(int NumberOfPasswordToGenerate, int lenghtOfRandomPassword){

            String[] multiplePasswords = new String[NumberOfPasswordToGenerate];
            for(int i =0; i<multiplePasswords.length; i++) {
                multiplePasswords[i] = createOneRandomPassword(lenghtOfRandomPassword);
            }
            return multiplePasswords;
        }


    public static boolean checkAllRequirements (String password, int minNumberInPassword, int minLengthInPassword){
            return  checkNumberInPassword(password) &&
                    checkMinNumberInPassword(password,minNumberInPassword) &&
                    checkLengthOfPassword(password, minLengthInPassword) &&
                    checkLowerCaseInPassword(password) &&
                    checkUpperCaseInPassword(password);
        }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(createMultiplePassword(2, 4)));
        int minCountOfDigitInPassword = 2;
        int minLengthOfPassword = 1;
        ///System.out.println(createOnePassword(3));
        //System.out.println(checkNumberInPassword("krishna64", 1));
    }
}
