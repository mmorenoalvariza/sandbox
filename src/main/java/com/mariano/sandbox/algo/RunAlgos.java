package com.mariano.sandbox.algo;

public class RunAlgos {
    public static void main(String[] args) {
        System.out.println(Algos.isPermutation("foo", "oof"));
        System.out.println(Algos.isPermutation("foo", "off"));
        System.out.println(Algos.hasPermutationPalindrome("Tact Coa"));

        System.out.println(Algos.urlify("Mr John Smith    ".toCharArray(), 13));
    }
}
