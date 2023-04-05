package com.icehrm_automation.LoginTest;
import com.icehrm_automation.utility.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class LoginTest1 extends BaseClass {
    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class method");
        // launch the browser and navigate to ice hrm application
		launchBrowser("chrome");
		driver.navigate().to("https://cybersuccess.icehrm.com/");
    }
        
    @AfterClass
    public void afterClass(){
        System.out.println("This is after class method");
        // close the browser instance
        //driver.close();
    }

    @Test
    public void verifyLoginWithValidCred(){
        System.out.println("This is add emp test method");
        // login to application
        // logout from application
       // enterText(By.name("username"), "admin");  // enter the username
        //enterText(By.name("password"), "password");  // enter password
        //click(By.xpath("loginButton")); // click on login button
        enterText (By.id("username"),"admin");
        enterText(By.id("password"),"2zuzfakn");
        click(By.xpath("//button[contains(text(),'Log in')]"));
        // verify login successfully
        click(By.xpath("logout")); // logout from application
    }
    @Test
    public void verifyLoginWithInvalidUsername() throws Exception {
        enterText(By.name("username"), "test1234");  // enter invalid username
        enterText(By.name("password"), "password");  // enter valid password
        click(By.id("loginButton")); // click on login
        String errorMsg = driver.findElement(By.id("")).getText(); // get the error message
        if(errorMsg.equals("text")){
            System.out.println("Passed the test case for invalid username and valid password");
        }else{
            throw new Exception("Failed: unable to verify error message for invalid username and valid password");
        }
    }

    @Test
    public void verifyLoginWithInvalidPassword() throws Exception {
        enterText(By.name("username"), "admin");  // enter invalid username
        enterText(By.name("password"), "test134");  // enter valid password
        click(By.id("loginButton")); // click on login
        String errorMsg = driver.findElement(By.id("")).getText(); // get the error message
        if(errorMsg.equals("text")){
            System.out.println("Passed the test case for invalid username and valid password");
        }else{
            throw new Exception("Failed: unable to verify error message for invalid username and valid password");
        }
    }

}