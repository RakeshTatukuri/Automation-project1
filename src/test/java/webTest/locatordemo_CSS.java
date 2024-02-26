package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatordemo_CSS {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		//tagname with id-->username
		//<input class="input_error form_input" placeholder="Username" type="text" data-test="username" id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//tagname with attribute-->password
		//<input class="input_error form_input" placeholder="Password" type="password" data-test="password" id="password" name="password" autocorrect="off" autocapitalize="none" value="">
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("secret_sauce");
		//tagname with classname-->login
		//<input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">
		driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
		//tagname with class and attribute
		driver.findElement(By.cssSelector("input.btn_action[value='Login']")).click();
	}
}
