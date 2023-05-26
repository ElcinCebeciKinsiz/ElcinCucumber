package stepdefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerOkuPage;
import utilities.ReusableMethods;
public class HerOkuAppStepDefinitions {
    HerOkuPage herOkuAppPage = new HerOkuPage();

    @Then("user clicks on addElement Button")
    public void user_clicks_on_add_element_button() {
        herOkuAppPage = new HerOkuPage();
        herOkuAppPage.addElementButton.click();
    }

    @Then("user waits until delete button appears")
    public void user_waits_until_delete_button_appears() {
        herOkuAppPage = new HerOkuPage();
        ReusableMethods.waitForVisibility(herOkuAppPage.deleteButton, 5);
    }

    @Then("tests that delete button is visible")
    public void tests_that_delete_button_is_visible() {
        herOkuAppPage = new HerOkuPage();
        Assert.assertTrue(herOkuAppPage.deleteButton.isDisplayed());
    }

    @Then("deletes delete button by clicking delete button")
    public void deletes_delete_button_by_clicking_delete_button() {
        herOkuAppPage = new HerOkuPage();
        herOkuAppPage.deleteButton.click();
    }

    @Then("tets that delete button is not visible")
    public void tets_that_delete_button_is_not_visible() {
        herOkuAppPage = new HerOkuPage();
        try {
            Assert.assertFalse(herOkuAppPage.deleteButton.isDisplayed());
        } catch (Exception e) {
            System.out.println("Test passed");
        }
    }
}















