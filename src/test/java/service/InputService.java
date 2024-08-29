package service;

import core.BaseService;
import io.qameta.allure.Step;

import static org.testng.Assert.assertEquals;


public class InputService extends BaseService {
    @Step("Ввести значение {value} в строку {inputName}")
    public static void setInputValue(String value, String inputName) {
        baseStorage.getElement(inputName).sendKeys(value);
    }

    @Step("Проверить введино ли значение {value} в строку {inputName}")
    public  static void checkInputValue(String value, String inputName) {
        String valueFromAttribute = baseStorage.getElement(inputName).getAttribute("value");
        assertEquals(valueFromAttribute, value,
                String.format("В строке ввода ожидалось %s, а выводится %s", value, valueFromAttribute));
    }

    public static void setAndCheckValue() {

    }
}
