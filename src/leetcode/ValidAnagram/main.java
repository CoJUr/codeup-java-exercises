package leetcode.ValidAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

//given two strings s and t, write a function to determine if t is an anagram of s. return false if not.
//hashmap approach: time complexity: O(n) i.e. 0(s+t), space complexity: O(n) i.e. 0(s+t)
public class main {


    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; //immediately return false if the two strings are not the same length because they cannot be anagrams
        }

        //if here, the strings are the same length
        int[] store = new int[26]; //create an array of size 26 to store the number of times each letter appears in the string
        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++; //increment the value of the array at the index of the letter in the 1st string
            store[t.charAt(i) - 'a']--; //decrement the value of the array at the index of the letter in the 2nd string
        }

        for (int n : store) if (n != 0) return false; //if the value of any index in the array is not 0, return false
        return true; //otherwise return true

    }

    //follow-up question: how to do it in O(1) space complexity?
    //can first sort the strings and then compare them with ==. if sorted, they should become the same string if they are anagrams
    // time complexity: O(nlogn)*  *=(if a good sort, not bubble) i.e. 0(slog(s) + tlog(t))
    // space complexity: O(1) if optimized (sorting shouldn't take extra space), else O(n)

//    public boolean isAnagram2(String S, String t, isAnagram2) {
//        String SortedS = Arrays.S.sort();
//
////        return Arrays.sort(S.toCharArray()) == Arrays.sort((t.toCharArray()));
//    }


    //solution using a hash table without unicode characters
    public boolean isAnagram3(String s, String t) {
        if (s == null && t == null) return true;
        else if (s == null || t == null) return false; //if one is null and the other is not, return false
        else if (s.length() != t.length()) return false; //if the lengths are not the same, return false

        Map<Character, Integer> dict = new HashMap<>(); //create a hashmap to store the number of times each letter appears in the string
        for (char c : s.toCharArray()) dict.put(c, dict.getOrDefault(c, 0) + 1); //add the letter to the hashmap if it doesn't exist, otherwise increment the value
        for (char c : t.toCharArray()) {
            int count = dict.getOrDefault(c, 0); //get the value of the letter in the hashmap or 0 if it doesn't exist (compile gives error if you try to get a value that doesn't exist)
            if (count == 0) return false;
            else dict.put(c, count - 1); //decrement the value of the letter in the hashmap
        }

        return true;
    }
    //^works because Unicode can be represented in java by a single char or two chars (surrogate pair) thanks:
    // to String.codePointAt(int index) which gets the integer representation of the unicode as the key in the hash table AND
    // Character.charCount(int code) which counts how many chars are being used to correctly increment the index



    //solution using sorting
    public boolean isAnagram4(String s, String t)
    {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
        //probably cant use this one during interviews because Arrays.Sort()
    }

    public static void main(String[] args) {
        main m = new main();
        System.out.println(m.isAnagram("anagram", "nagaram"));
    }
}
