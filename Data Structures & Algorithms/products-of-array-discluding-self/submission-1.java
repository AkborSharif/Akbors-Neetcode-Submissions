class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] a = new int[nums.length];
        int [] b = new int[nums.length];

        a[0] = 1;

        for(int i = 0; i<nums.length-1; i++){
            a[i+1] = a[i]*nums[i];
        }
        int n = 1;
        for(int i = nums.length-1; i>=0; i--){
            b[i] = n*a[i];
            n *= nums[i];
        }

        return b;
    }
}  
