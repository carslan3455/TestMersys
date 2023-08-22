package utilities;

import org.openqa.selenium.By;

public interface Locators {

    By userName = By.cssSelector("input#mat-input-0");
    By password = By.cssSelector("input#mat-input-1");
    By loginBtn = By.cssSelector("span[class=mdc-button__label]");
    By dashboard = By.xpath("(//span[contains(text() ,'Dashboard')]) [3]");
}
