package java_course_tau.chapter8_data_types;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    // DataProvider для передачи параметров в тесты
    @DataProvider(name = "passwordData")
    public Object[][] passwordData() {
        return new Object[][]{
                // testCaseName, newPassword, username, oldPassword, expectedResult
                {"PasswordTooShort", "short", "username", "oldPassword", false},
                {"NoUppercase", "lowercase1!", "username", "oldPassword", false},
                {"NoSpecialChar", "NoSpecialChar1", "username", "oldPassword", false},
                {"ContainsUsername", "username123!", "username", "oldPassword", false},
                {"SameAsOldPassword", "oldPassword", "username", "oldPassword", false},
                {"ValidPassword", "Valid1Password!", "username", "oldPassword", true}
        };
    }

    @Test(dataProvider = "passwordData")
    public void testPasswordValidation(String testCaseName, String newPassword, String username, String oldPassword, boolean expectedResult) {
        boolean result = validator.validatePassword(newPassword, username, oldPassword);
        assertEquals(result, expectedResult, testCaseName + " failed.");
    }
}

