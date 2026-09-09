class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x=0;x<nums.length;x++){
            int needed = target - nums[x];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),x};
            }

            map.put(nums[x],x);
        }
        return new int[]{};
    }
}
