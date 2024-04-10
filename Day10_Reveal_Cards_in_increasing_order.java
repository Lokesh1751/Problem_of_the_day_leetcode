//TLE Solution but correct for all test cases
class Solution {
   public static ArrayList<Integer> ans=new ArrayList<>();
    public static boolean check(int deck[]){
        Queue<Integer> q=new LinkedList<>();
        for(Integer i:deck){
            q.add(i);
        }
        ArrayList<Integer> al=new ArrayList<>();
        while(q.size()>=1){
            al.add(q.remove());
            if(q.size()>0){ 
            int ele=q.remove();
           q.add(ele);
            } 
            
        }

        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>al.get(i+1)) return false;
        }
        return true;
    }
    public static void helper(int idx,int[] deck){
if(idx==deck.length){
    if(check(deck)){
        for(Integer i:deck){
           ans.add(i);
        }
        return;
    }
}

        for(int i=idx;i<deck.length;i++){
            int temp=deck[i];
            deck[i]=deck[idx];
            deck[idx]=temp;
            helper(idx+1,deck);
            temp=deck[i];
            deck[i]=deck[idx];
            deck[idx]=temp;
        }
    }
    public int[] deckRevealedIncreasing(int[] deck) {
        ans=new ArrayList<>();
        helper(0,deck);
        System.out.print(ans);
        int sol[]=new int[ans.size()];
        int i=0;
        for(Integer ele:ans){
            sol[i++]=ele;
        }
        return sol;
    }
}
//optimized code with queue
import java.util.*;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < deck.length; i++) {
            q.add(i);
        }
        int ans[] = new int[deck.length];
        for (int card : deck) {
            int idx = q.remove();
            ans[idx] = card;
            if (!q.isEmpty()) {
                int idx2 = q.remove();
                q.add(idx2);
            }
        }
        return ans;
    }
}


//LEETCODE
