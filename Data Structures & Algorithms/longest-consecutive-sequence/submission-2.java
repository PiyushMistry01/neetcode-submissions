class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for(int num : nums){
            set.add(num);
        }

        for(int i=0;i<nums.length;i++){
            int length = 0;
            if(!set.contains(nums[i]-1)){
                length++;
                int currNum = nums[i];
                while(set.contains(currNum+1)){
                    currNum++;
                    length++;
                }

                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
