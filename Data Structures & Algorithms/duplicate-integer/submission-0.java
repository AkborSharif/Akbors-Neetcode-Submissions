class Solution {
    public boolean hasDuplicate(int[] nums) {
        //time: O(N) because it has to go through the entire list worst case to find the duplicate
        //space: O(N) because we use a set to keep the n data worst case duplicate is the last value so we stored N-1 items in the set
        Set<Integer> dup = new HashSet<>();
        for(int num: nums){
            if(dup.contains(num)){
                return true;
            }
            dup.add(num); //1, 2, 3, true
        }
        return false;
    }
}