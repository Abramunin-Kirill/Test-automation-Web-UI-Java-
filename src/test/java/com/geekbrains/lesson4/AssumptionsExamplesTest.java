package com.geekbrains.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsExamplesTest {
    @Test
    void trueAssumption() {
        Assumptions.assumeTrue(1 == 2);
        Assertions.assertFalse(true);
        Assertions.assertTrue(false);
    }

    @Test
    void softAssertionsTest() {

    }


}
