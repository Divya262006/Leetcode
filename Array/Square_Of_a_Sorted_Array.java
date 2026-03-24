class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] k=new int[nums.length];
        int left=0;
        int right=nums.length-1;

        for(int i=nums.length-1; i>=0;i--){
            int LSquare=nums[left]*nums[left];
            int RSquare=nums[right]*nums[right];

            if(LSquare>RSquare){
                k[i]=LSquare;
                left++;
            }else{
                 k[i]=RSquare;
                right--;
            }
        }
        return k;
    }
}