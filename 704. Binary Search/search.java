class Solution {
    public int search(int[] nums, int target) {
        int low=0,high,mid=0,k=0;
        high=nums.length-1;
        while(low<=high){
            mid=(high+low)/2;
            if(target==nums[mid]){
                k=1;
                break;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(k==1)
        return mid;
        else
        return -1;
    }
}