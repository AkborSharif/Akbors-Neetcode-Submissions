class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for(String s: strs){
                map.computeIfAbsent(getKey(s), k-> new ArrayList<>()).add(s);
            }

            return new ArrayList<>(map.values());
    }
    private String getKey(String s){
        int [] freqArray = new int[26];

        for(char c: s.toCharArray()){
            freqArray[c-'a']++;
        }

        return Arrays.toString(freqArray);
    }
}
