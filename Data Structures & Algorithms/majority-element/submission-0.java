class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int maxFreq=0;
        int answer=0;

        for(int num:nums){
            int freq = map.getOrDefault(num,0)+1;
            map.put(num,freq);

            if(freq>maxFreq){
                maxFreq = freq;
                answer=num;
            }
        }
        return answer;
    }
}