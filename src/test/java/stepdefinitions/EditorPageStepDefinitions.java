package stepdefinitions;
import io.cucumber.java.en.Then;
import pages.EditorPage;
import utilities.ConfigReader;
public class EditorPageStepDefinitions {
    EditorPage editorPage=new EditorPage();
    @Then("user clicks on new button")
    public void user_clicks_on_new_button() {
        editorPage=new EditorPage();
        editorPage.editorHomePageNewButton.click();
    }
    @Then("user enters {string} to firstName box")
    public void user_enters_to_first_name_box(String firstname) {
        editorPage=new EditorPage();
        editorPage.firstNameTextBox.sendKeys(firstname);
    }
    @Then("user enters {string} to lastName box")
    public void user_enters_to_last_name_box(String lastname) {
        editorPage=new EditorPage();
        editorPage.lastNameTextBox.sendKeys(lastname);
    }
    @Then("user enters {string} to position box")
    public void user_enters_to_position_box(String position) {
        editorPage=new EditorPage();
        editorPage.positionTextBox.sendKeys(position);
    }
    @Then("user enters {string} to office box")
    public void user_enters_to_office_box(String office) {
        editorPage=new EditorPage();
        editorPage.officeTextBox.sendKeys(office);
    }
    @Then("user enters {string} to extension box")
    public void user_enters_to_extension_box(String extention) {
        editorPage=new EditorPage();
        editorPage.extensionTextBox.sendKeys(extention);
    }
    @Then("user enters {string} to startdate box")
    public void user_enters_to_startdate_box(String startdate) {
        editorPage=new EditorPage();
        editorPage.startDateTextBox.sendKeys(startdate);
    }
    @Then("user enters {string} to salary box")
    public void user_enters_to_salary_box(String salary) {
        editorPage=new EditorPage();
        editorPage.salaryTextBox.sendKeys(salary);
    }
}
