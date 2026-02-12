package coreJavaTraining;

import org.testng.annotations.Test;

public class TestNg {
    @Test(priority = 1)
    void setup()
    {
        System.out.println("Set up");
    }
    @Test(priority = 2)
    void login ()
    {
        System.out.println("Login");
    }
    @Test(priority = 3)
    void close ()
    {
        System.out.println("close");
    }

}
