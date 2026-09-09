class Solution {
    public boolean isAnagram(String s, String t) {
        int[] scount = new int[26];

        for(char c: s.toCharArray()){
            scount[c-'a']++;
        }

        
        for(char c: t.toCharArray()){
            scount[c-'a']--;
        }

        
        for(int n: scount){
           if(n!=0){
            return false;
           }
        }

        return true;


    }
}
