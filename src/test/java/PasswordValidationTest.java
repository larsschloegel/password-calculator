import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import javax.print.DocFlavor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationTest {

    @ParameterizedTest
    @CsvSource({
            "Test, 5, false",
            "Test1, 5, true",
            "Test12, 5, true",
    })
    void checkPasswordLength(String password, int lenght, boolean expected) {
        //When
        boolean actual = PasswordValidation.checkLengthOfPassword(password, lenght);
        //Then
        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "KeineNummer, 1, false",
            "Nummer1, 1, true",
            "1und2, 1, true",
            "1und2, 2, true",
            "1und2und3, 1, true",
    })
    void checkMinNumberInPassword(String password, int minNumberinPassword, boolean expected){
        //When
        boolean actual = PasswordValidation.checkMinNumberInPassword(password, minNumberinPassword);
        //Then
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "KeineNummer, false",
            "Nummer1, true",
            "1Nummer, true",
            "Num1mer, true",

    })
    void checkNumberInPassword(String password, boolean expected){
        //When
        boolean actual = PasswordValidation.checkNumberInPassword(password);
        //Then
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "KeineNummer, true",
            "NUMMER, false",
            "nummer, false",
    })
    void checkLowerAndUpperCaseInPassword(String password, boolean expected){
        //When
        boolean actual = PasswordValidation.checkLowerAndUpperInPassword(password);
        //Then
        assertEquals(expected, actual);
    }

}
