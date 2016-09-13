package ltcode;

/**
 * Created by thd on 2016/9/13.
 */

/***leetcode#5最长回文字符串
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000,
 * and there exists one unique longest palindromic substring.
 Subscribe to see which companies asked this question

 */
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if(s.isEmpty()){return null;}
        if(s.length() == 1){return s;}
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            // get longest palindrome with center of i
            String tmp = helper(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
            // get longest palindrome with center of i, i+1
            tmp = helper(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
        return longest;
    }
    // Given a center, either one letter or two letter,
    // Find longest palindrome
    public static String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        String subS = s.substring(begin + 1, end);
        return subS;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ABCCBA"));//babcbabcbaccba
    }
}
