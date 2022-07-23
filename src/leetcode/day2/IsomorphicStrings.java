package leetcode.day2;

import java.util.HashMap;

//given 2 strings s and t, determine if theyre isomorphic.
// can the characters in s be replaced to get t?
// all occurrences replaced while preserve the order of the characters. no 2 chars map to the same char, but a char can map to self
//constraints:   1 <= s.length <= s.length 5 * 10^4     t.length == s.length   s and t consist of any valid ascii char
public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.equals(t)) return true;

        HashMap<Character, Character> hm = new HashMap<>();
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                if ((hm.get(s.charAt(i)) == t.charAt(i))) {
                    flag = true;
                    continue;
                } else {
                    return false;
                }
            }

            if (hm.containsValue(t.charAt(i))) {
                return false;
            } else {
                hm.put(s.charAt(i), t.charAt(i));
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        System.out.println(IsomorphicStrings.isIsomorphic("egg", "add"));
    }
}

class SolutionWithoutMaps {

//    public boolean isIsomorphic (String s1, String s2) {
//        int[] m = new int[512];
//
//        for (int i = 0; i < s1.length(); i++) {
//            if (m[s1.charAt(i)] != m[s2.charAt(i) + 256]) return false;
//            m[s1.charAt(i)] = m[s2.charAt(i) +256] = i+1;
//        }
//
//        return true;

    public boolean isIso(String s, String t) {
        int[] map = new int[128];
        int[] book = new int[128];

        for (int i = 0; i < s.length(); i++) {
            int ss = (int) s.charAt(i);
            int ts = (int) t.charAt(i);
            if (map[ss] == 0 && book[ts] == 0) {
                map[ss] = ts;
                book[ts] = 1;
            } else if (map[ss] != ts) return false;
        }
        return true;
    }

    }

