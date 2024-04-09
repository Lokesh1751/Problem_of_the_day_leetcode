class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxi=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                count++;
                maxi=Math.max(maxi,count);
            }
            else if(c==')'){
                count--;
                maxi=Math.max(maxi,count);
            }
        }
        return maxi;
    }
}
//LEETCODE
