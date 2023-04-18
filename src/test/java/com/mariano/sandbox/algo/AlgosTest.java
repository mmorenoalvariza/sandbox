package com.mariano.sandbox.algo;

import org.junit.jupiter.api.Test;

import org.hamcrest.Matchers.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class AlgosTest {

    @Test
    public void testAreBalanced() {
        char[] arr = "[]".toCharArray();
        Algos algos = new Algos();
        assertThat(algos.areBalanced(arr)).isTrue();
        arr = "]]]".toCharArray();
        assertThat(algos.areBalanced(arr)).isFalse();
        arr = "[[[][][[]]]]".toCharArray();
        assertThat(algos.areBalanced(arr)).isTrue();
        arr = "[]]]".toCharArray();
        assertThat(algos.areBalanced(arr)).isFalse();

    }

}