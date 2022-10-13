package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertProgram {
    @Test
    public void demo() {
        boolean actualResult = true;
        boolean expectedResult = false;

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualResult, expectedResult); // it will pass wether the test is failing
        System.out.println("Boolean Assertion is passed");

        int actualIntResult = 12;
        int expectedIntResult = 124;
        sa.assertEquals(actualIntResult, expectedIntResult); // it will pass wether the test is failing
        System.out.println("Int Assertion is passed");

        String actualStringResult = "Qsoider";
        String expectedStringResult = "Jspider";
        sa.assertEquals(actualStringResult, expectedStringResult); // it will pass wether the test is failing
        System.out.println("Int Assertion is passed");

        sa.assertAll(); // it will fail test if it is not pass but it will execute previous line of
                        // code. and also it is using at the end of program

    }

}
