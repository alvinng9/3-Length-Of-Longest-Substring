package org.example;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        int length = 0;
        int[] array = new int[128];
        for (int right = 0; right < s.length(); right++) {
            array[s.charAt(right)]++;
            if (array[s.charAt(right)] <= 1) {
                length++;
                max = Math.max(length, max);
            } else {
                array[s.charAt(left)]--;
                left++;
                array[s.charAt(right)]--;
                length--;
                right--;
            }
        }
        return max;
    }
}
