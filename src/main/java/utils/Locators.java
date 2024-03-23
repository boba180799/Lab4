package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage{
        By JAVA_BUTTON = By.xpath("//*[@id=\"p-logo\"]/a");

        By Label1 = By.xpath("//*[@id=\"pt-anontalk\"]/a/span");
        By Label2 = By.xpath("//*[@id=\"pt-anoncontribs\"]/a/span");
        By Label3 = By.xpath("//*[@id=\"pt-createaccount\"]/a/span");
        By Label4 = By.xpath("//*[@id=\"pt-login\"]/a/span");
        By Label5 = By.xpath("//*[@id=\"ca-nstab-main\"]/a/span");

    }
}
