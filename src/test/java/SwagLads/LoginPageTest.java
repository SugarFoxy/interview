package SwagLads;

import core.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import storage.LoginWebElementStorage;

import static core.BaseService.setBaseStorage;
import static service.InputService.checkInputValue;
import static service.InputService.setInputValue;

public class LoginPageTest extends BaseTest {

    @BeforeMethod
    public void init() {
        driver.get("https://www.saucedemo.com/");
        setBaseStorage(new LoginWebElementStorage());
    }

    @Test(description = "Проверить аутентификацию")
    public void testAuthenticationWhenLoginAndPassValid() {
        setInputValue("standard_user", "Логин");
        setInputValue("secret_sauce", "Пароль");
        checkInputValue("standard_user", "Логин");
    }
}
