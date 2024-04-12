import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() <= k) return "0";
        
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }
            st.push(c);
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        
        // Constructing the resulting string using StringBuilder
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        ans.reverse();
        
        // Remove leading zeros
        while (ans.length() > 0 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        
        // Return "0" if the resulting string is empty
        if (ans.length() == 0) return "0";
        
        return ans.toString();
    }
}

//leetcode
