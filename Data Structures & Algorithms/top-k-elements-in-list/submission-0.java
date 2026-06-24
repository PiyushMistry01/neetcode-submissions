class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        //Count freq
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        // Create Max Heap to remove largest value first
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> freq.get(b)-freq.get(a));

        //Enter value in heap
        pq.addAll(freq.keySet()); //keySet() stores the keys and arranges them as per thier freqs

        int result[] = new int[k];

        for(int i=0;i<k;i++){
            result[i]=pq.poll();
        }

        return result;
    }
}
