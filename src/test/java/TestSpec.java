import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSpec {
    private Person person;

    @Given("^a Person with a full name")
    public void certificationName() throws Throwable {
        person = new Person();
    }

    @When("^the name is (.*)$")
    public void gotMarks(String name) throws Throwable {
        person.setFullName(name);
    }

    @Then("^(.*) is the prename$")
    public void certifiedYes(String name) throws Throwable {
        assertThat(name).isEqualTo(person.getPreName());

    }
}
