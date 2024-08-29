package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

abstract public class BaseStorage {
    protected static WebDriver driver;
    protected final Map<String, WebElement> elements = new HashMap<>();

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public WebElement getElement(String key) {
        return elements.get(key);
    }

}
