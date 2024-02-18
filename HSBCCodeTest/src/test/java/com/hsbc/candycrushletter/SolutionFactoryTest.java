package com.hsbc.candycrushletter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionFactoryTest {
    @Test
    public void testCase1() {
        String output = SolutionFactory.solution("aabcccbbad", "Stage1");
        Assertions.assertEquals("d", output);
    }

    @Test
    public void testCase2() {
        String output = SolutionFactory.solution("aabcccbba", "Stage1");

        Assertions.assertTrue(output.isEmpty());
    }

    @Test
    public void testCase3() {
        String outStr = SolutionFactory.solution("abcccbad", "Stage2");
        Assertions.assertEquals("d", outStr);
    }

    @Test
    public void testCase4() {
        String outStr = SolutionFactory.solution("abcccba", "Stage2");
        Assertions.assertTrue(outStr.isEmpty());
    }
}
