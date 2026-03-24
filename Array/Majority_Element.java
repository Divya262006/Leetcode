class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int n=0;
        for(int i=0; i<nums.length; i++)
        {
            if(n==0)
            {
                c=nums[i];
            }
            if(nums[i]==c)
            {
                n++;
            } else {
                n--;
            }

        }
        return c;
    }
}