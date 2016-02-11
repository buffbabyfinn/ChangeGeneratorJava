import org.junit.*;
import static org.junit.Assert.*;

public class GenerateChangeTest {

  @Test
  public void generateChange_AmountOfMoneyInCents_quarters() {
    GenerateChange generateChangeTest = new GenerateChange();
    assertEquals("1 quarter." , generateChangeTest.generateChange(25));
  }
  @Test
  public void generateChange_AmountOfMoneyInCents_dimes() {
    GenerateChange generateChangeTest = new GenerateChange();
    assertEquals("1 quarter. 1 dime." , generateChangeTest.generateChange(35));
  }

  @Test
  public void generateChange_AmountOfMoneyInCents_nickels() {
    GenerateChange generateChangeTest = new GenerateChange();
    assertEquals("1 quarter. 1 dime. 1 nickel." , generateChangeTest.generateChange(40));
  }
  @Test
  public void generateChange_AmountOfMoneyInCents_pennies() {
    GenerateChange generateChangeTest = new GenerateChange();
    assertEquals("1 quarter. 1 dime. 1 nickel. And 1 penny." , generateChangeTest.generateChange(41));
  }
}
