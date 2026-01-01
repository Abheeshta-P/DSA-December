class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];

        // left
        ans[0] = 1;
        for(int i=1;i<nums.length;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        //right
        int right = 1;
        for(int i=nums.length-2;i>=0;i--){
            ans[i] = ans[i] * right * nums[i+1];
            right *= nums[i+1];
        }
        return ans;
    }
}
