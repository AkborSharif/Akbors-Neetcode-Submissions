class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()<t.length()) return false;
        
        Map<Character, Integer> freq = new HashMap<>();

        for (Character c : s.toCharArray()) {
            freq.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        for (Character c : t.toCharArray()) {
            freq.compute(c, (k, v) -> v == null ? null : v - 1);
        }

        for (Integer c : freq.values()) {
            if (c > 0)
                return false;
        }

        return true;
    }
}
