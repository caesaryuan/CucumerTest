package info.xiaoc.CucumberTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

/**
 * Glue class for deposit/withdraw features.
 * Created by cyuan on 2016/1/11.
 */
public class DepositStepDefinitions {

    private Account account;

    @Given("^a User has £(-?\\d+) in their account$")
    public void aUserHasNoMoneyInTheirAccount(int amount) throws Throwable {
        User user = new User();
        account = new Account();
        account.setBalance(amount);
        user.setAccount(account);

        assertTrue("The balance is not equal to the specified initial balance.", account.getBalance() == amount);
    }

    @When("^£(-?\\d+) is deposited into the account$")
    public void £_is_deposited_in_to_the_account(int amount) {
        account.deposit(amount);
    }

    @Then("^the balance should be £(-?\\d+)$")
    public void the_balance_should_be_£(int expectedBalance) {
        assertTrue("The expected balance was £"+expectedBalance+", but actually was: "
                + account.getBalance(), account.getBalance() == expectedBalance);
    }

    @When("^£(-?\\d+) is widthdrawn from the account$")
    public void £_is_widthdrawn_from_the_account(int amount) throws Throwable {
        account.withdraw(amount);
    }
}
