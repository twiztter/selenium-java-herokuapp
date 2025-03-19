package steps;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.Login;

public class HerokuappSteps {

    Login homePage = new Login();

    @Given("I navigate to the website")
    public void navigateToHeroku() {
        homePage.navigateToHerokuapp();
    }

    @When("I click on the login section")
    public void loginAssertions() {
        homePage.clickOnLoginSection();

        String actualLoginHeader = homePage.loginHeader();
        String actualLoginParagraph = homePage.loginParagraph();

        String expectedLoginHeader = "Login Page";
        String expectedLoginParagraph = "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.";

        Assert.assertEquals(actualLoginHeader, expectedLoginHeader, "El texto del encabezado no coincide");
        Assert.assertEquals(actualLoginParagraph, expectedLoginParagraph, "El texto del parrafo no coincide");
    }

    @When("I enter my username and password")
    public void addCredentials() {
        homePage.enterUser();
        homePage.enterPass();
    }

    @When("I click the login button")
    public void clickLogin(){
        homePage.clickOnLogin();
    }

    @Then ("I should see the message You logged into a secure area!")
        public void loginSuccess(){
        boolean isAlertPresent = homePage.loginAlertAssertion();

        Assert.assertTrue(isAlertPresent, "El mensaje de alerta no está presente");
        }

}
