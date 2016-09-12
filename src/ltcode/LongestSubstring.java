package ltcode;

/**
 * Created by thd on 2016/9/12.
 */

import java.util.HashMap;

/**
 * Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0, removeStart = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, i);
            }else{
                max = Math.max(max, map.size());
                while (map.containsKey(ch)){
                    map.remove(s.charAt(removeStart));
                    removeStart++;
                }
                map.put(ch, i);
            }
        }
        max = Math.max(max, map.size());
        return max;
    }
    public static void main(String[] args){
       String a = "ABCABCBB";
        System.out.println(lengthOfLongestSubstring(a));
    }
}
