class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum=0,sumnatural;

        for(int i=0;i<length;i++){
            sum=sum+nums[i];

        }
        sumnatural = (length*(length+1))/2;

        return sumnatural-sum;
    }
}