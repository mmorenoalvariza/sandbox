package com.mariano.sandbox.algo;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Algos {

    public boolean areBalanced(char[] arr)
    {
        if (arr[0] != '[') {
            return false;
        }
        int i = 0;
        char current = arr[i];
        Stack<Character> stk = new Stack<>();
        stk.push(current);
        while (!stk.empty() && i < arr.length -1)
        {
            i++;
            current = arr[i];
            if (current == '[')
            {
                stk.push(current);
            }
            else stk.pop();
        }
        return stk.empty() && i == arr.length -1;
    }

    // 1.1
    // Can also do n² if no other DS can be used
    // Can create a boolean array and check there too
    public static boolean allUnique(String word) {
        if (word.length() > 128) {
            return false;
        }
        Set<Character> uniqueChars = new HashSet();
        for(Character aChar : word.toCharArray()) {
            if (uniqueChars.contains(aChar)) {
                return false;
            }
            uniqueChars.add(aChar);
        }
        return true;
    }

    //1.2
    //Sort both words and check if equals O(nLog(n)) or we can do next:
    public static boolean isPermutation(String wordA, String wordB) {
        if (wordA.length() != wordB.length()) {
            return false;
        }
        int[] charArray = new int[128];
        for (Character c : wordA.toCharArray()) {
            charArray[c]++;
        }
        for(Character c : wordB.toCharArray()) {
            charArray[c]--;
            if(charArray[c] < 0) {
                return false;
            }
        }
        return true;
    }

    //1.3
    public static char[] urlify(char[] sentence, int realLength) {
        int lastFree = sentence.length -1;
        for(int i = realLength -1; i>0; i--) {
            if(sentence[i] != ' ') {
                sentence[lastFree] = sentence[i];
                lastFree--;
            } else {
                sentence[lastFree] = '0';
                sentence[lastFree - 1] = '2';
                sentence[lastFree - 2] = '%';
                lastFree = lastFree -3;
            }
        }
        return sentence;
    }

    //1.4
    public static boolean hasPermutationPalindrome(String word) {
        int[] charArray = new int[128];
        int specialChars = 0;
        for (Character c : word.toLowerCase().toCharArray()) {
            // TODO Spaces and special characters don't count for the result
            if(c != ' ') {
                charArray[c]++;
            } else {
                specialChars++;
            }
        }
        //if word lenght is even, all chars must be twice else only one lettre should be one and the rest 2
        int odds = 0;
        for(int i = 0; i<128 ; i++) {
            if (charArray[i] % 2 == 1) {
                odds++;
            }
            if (odds > 1) {
                return false;
            }
        }
        if (word.length() - specialChars % 2 == 0) {
            return odds == 0;
        } else {
            return odds == 1;
        }

    }
}
