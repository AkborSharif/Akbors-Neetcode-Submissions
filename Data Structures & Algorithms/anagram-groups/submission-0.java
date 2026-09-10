class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sol = new HashMap<>();

        for(String s : strs){
            sol.computeIfAbsent(getKey(s), v-> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(sol.values());
    }
    public String getKey(String s){
        int [] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        return Arrays.toString(freq);
    }
}
