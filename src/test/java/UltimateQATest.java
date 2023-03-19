import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UltimateQATest extends PageSetUp{
    @Test
    public void testOne() {
        WebElement button = driver.findElement(By.id("idExample"));
                button.click();

                WebElement buttonSuccess = driver.findElement(By.className("entry-title"));
                //import static
        Assertions.assertEquals("Button success", buttonSuccess.getText());

        @Test
                public void testTwo() {
            WebElement nameInput = driver.findElement(By.id("et_pb_contact_name_0"));
                    nameInput.sendKeys("Piotr");
            WebElement emailInput = driver.findElement(By.id("et_pb_contact_email_0"));
            emailInput.sendKeys("tester@tester.pl");
        }


    }


}
