import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
        "KeineNummer, 0, true",
        "KeineNummer, 1, false",
        "Nummer1, 0, false",
        "Nummer1, 1, true",
        "1und2, 0, false",
        "1und2, 1, false",
        "1und2, 2, true",

})
    void checkNumberInPassword(String password, int minNumberinPassword, boolean expected){
        //When
        boolean actual = PasswordValidation.checkNumberInPassword(password, minNumberinPassword);
        //Then
        assertEquals(expected, actual);
    }

}
