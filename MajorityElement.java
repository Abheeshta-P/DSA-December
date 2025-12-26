class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length,check=n/2,result=-1;

        int count=0,majority=-1;
        for(int i=0;i<n;i++){
            if(count==0){
                majority=nums[i];
                count++;
            }
            else if (nums[i]==majority){
                count++;
            }
            else{
                count--;
            }
        }
        //to verify
        count=0;
        for(int num : nums){
            if(num==majority)
            count++;
        }
        if(count>check)
         result=majority;
        return result;
    }
}
