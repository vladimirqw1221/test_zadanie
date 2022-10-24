package net.azurewebsites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class FirstTest  extends Befcls{

    @Test
    public void FirstTest() {

        $(By.xpath("//input[@id='login']")).sendKeys("rekame2869@seinfaq.com");
        $(By.xpath("//input[@id='password']")).sendKeys("XRCa91zn4fsJzcHW");
        $(By.cssSelector("button[type='submit'] span")).click();
        $(By.xpath("//span[contains(text(),'Система планирования и мониторинга маршрутов')]")).shouldHave(text("Система планирования и мониторинга маршрутов"));




    }


}
