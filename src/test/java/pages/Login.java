package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BasePage {

    private String loginsection = "/html/body/div[2]/div/ul/li[21]/a";
    private String loginHeader = "//h2";
    private String loginParagraph = "//*[@id=\"content\"]/div/h4";
    private String userInput = "//*[@id=\"username\"]";
    private String user = "tomsmith";
    private String passwordInput = "//*[@id=\"password\"]";
    private String password = "SuperSecretPassword!";
    private String loginButton = "//*[@id=\"login\"]/button";
    private String loginAlert = "//*[@id=\"flash-messages\"]";

    public Login() {
        super(driver);
    }

    public void navigateToHerokuapp() {
        navigateTo("https://the-internet.herokuapp.com/");
    }

    public void clickOnLoginSection() {
        clickElement(loginsection);
    }

    public String loginHeader() {
        return getText(loginHeader);
    }

    public String loginParagraph() {
        return getText(loginParagraph);
    }

    public void enterUser() {
        write(userInput, user);
    }

    public void enterPass() {
        write(passwordInput, password);
    }

    public void clickOnLogin() {
        clickElement(loginButton);
    }

    public Boolean loginAlertAssertion() {
        List<WebElement> elements = driver.findElements(By.xpath(loginAlert));
        return !elements.isEmpty();
    }

}
