class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            if(!set.contains(num-1)){
                int length = 1;
                int currNum = num;
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
