package Gen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_concept1 
{
@FindBy(id="email")
private WebElement emailTbox;
@FindBy(id="pass")
private WebElement passTbox;
@FindBy(xpath="//button[@name='login']")
private WebElement loginbtn;
//Initialization
public Pom_concept1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
// utilization
public void paasdata11(String un)
{
	emailTbox.sendKeys(un);
}
public void paasdata2(String pwd)
{
	passTbox.sendKeys(pwd);
}
public void clicklogin()
{
	loginbtn.click();
}
}