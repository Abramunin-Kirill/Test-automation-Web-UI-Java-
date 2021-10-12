package com.geekbrains.lesson4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.geekbrains.lesson4.Functions.isNumberPrime;
import static org.assertj.core.api.Assertions.assertThat;

public class AssertJExamplesTest {
    @Test
    void IsNumberPrimeWithAssertJTest() {
        assertThat(isNumberPrime(3)).isTrue();

    }

    @Test
    void collectionAssertJTest() {
        List<String> testCollection = new ArrayList<>(Arrays.asList("test", "test1", "test2"));
        assertThat(testCollection).contains("test1").containsAnyOf("test", "test5");
        assertThat(5).isLessThan(6).isGreaterThan(1);
    }


}
