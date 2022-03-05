import org.junit.*;
import static org.junit.Assert.*;
import io.cucumber.java.en.*;


public class LeapStepDef {
    
    private int year;
    private boolean isLeap;
    
@Given("a year {int}")
public void a_year(Integer int1) {
    year = int1;
}

@When("Divisible {int}")
public void divisible(Integer int1) {
    
    isLeap = Leap.isLeapYear(year,int1);
     
}
@Then("return is a leap year {string}")
public void return_is_a_leap_year(String string) {
   assertEquals(new Boolean(string),isLeap);
}
    
}
