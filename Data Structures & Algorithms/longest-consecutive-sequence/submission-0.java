class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest=0;

        for(int num : set){
            if(!set.contains(num-1)){
                int length=1;
                int currentNum=num;

                while(set.contains(currentNum+1)){
                    length++;
                    currentNum++;
                }

                longest = Math.max(length,longest);
            }
        }
        return longest;
    }
}
