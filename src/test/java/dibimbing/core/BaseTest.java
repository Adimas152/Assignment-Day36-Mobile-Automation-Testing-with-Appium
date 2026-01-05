package dibimbing.core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
//    @BeforeTest
    @BeforeMethod
    public void setUp() {
        DriverManager.initDriver();
    }

//    @AfterTest
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverManager.quitDriver();
    }


}