class Solution {
    public int pivotIndex(int[] nums) {
        int t=0;
        int suml=0;
        for(int i=0;i<nums.length;i++){
            t+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
           int sumr=t-suml-nums[i];

            if(suml==sumr){
                return i;
            }
            suml+=nums[i];
        }
        return -1;
    }
}
