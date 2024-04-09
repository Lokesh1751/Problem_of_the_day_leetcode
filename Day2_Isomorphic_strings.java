import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapping = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (mapping.containsKey(sChar)) {
                if (mapping.get(sChar) != tChar) {
                    return false; // Different mapping for the same character in s
                }
            } else {
                if (mapping.containsValue(tChar)) {
                    return false; // One-to-one mapping violated
                }
                mapping.put(sChar, tChar);
            }
        }
        
        return true;
    }
}

//leetcode
