package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void canFinishTest() {
        Solution solution = new Solution();
        int[][] outputOne = {{1, 0}};
        Assert.assertTrue(solution.canFinish(2, outputOne));
        int[][] outputTwo = {{1, 0}, {0, 1}};
        Assert.assertFalse(solution.canFinish(2, outputTwo));
    }
}