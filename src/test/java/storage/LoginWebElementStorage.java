package storage;

import core.BaseStorage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWebElementStorage extends BaseStorage {

    public LoginWebElementStorage() {
        setElements(driver);
    }

    private void setElements(WebDriver driver) {
        elements.put("Логин", driver.findElement(By.xpath("//input[@id=\"user-name\"]")));
        elements.put("Пароль", driver.findElement(By.xpath("//input[@id=\"password\"]")));
        elements.put("Авторизоваться", driver.findElement(By.xpath("//input[@id=\"login-button\"]")));
    }
}
