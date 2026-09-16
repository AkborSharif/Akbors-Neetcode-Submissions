class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] a = new int[nums.length];
        int [] b = new int[nums.length];

        a[0] = 1;

        for(int i = 0; i<nums.length-1; i++){
            a[i+1] = a[i]*nums[i];
        }
        b[nums.length-1] = 1;
        for(int i = nums.length-1; i>0; i--){
            b[i-1] = b[i]*nums[i];
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = a[i]* b[i];
        }

        return nums;
    }
}  
