class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int num:nums){
            if(num>max){
            max=num;
            }
            
        }
        int maxlen=0;
        int cnt=0;
        for(int num:nums){
            if(num==max){
            cnt++;
            maxlen=Math.max(maxlen,cnt);
        }else
        cnt=0;

        }
        return maxlen;
    }
}