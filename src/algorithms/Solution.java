package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * eg.
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String subStr = s.charAt(i) + "";
            for (int j = i + 1; j < s.length(); j++) {
                if (!subStr.contains(s.charAt(j) + "")) {
                    subStr = subStr + s.charAt(j);
                } else {
                    break;
                }
            }
            if (length < subStr.length()) {
                length = subStr.length();
            }
        }
        return length;
    }

    public static int longestValidParentheses(String s) {
        int length = 0 ;
        
        return length;
    }

    public static void main(String[] args) {
        String testStr = "pwwkew";
        System.out.println(lengthOfLongestSubstring(testStr));
    }
}
