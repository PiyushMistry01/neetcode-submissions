class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;

        for(int pile : piles){
            right=Math.max(right,pile);
        }
        int answer = right;

        while(left<=right){
            int mid = (left+right)/2;
            int hours = 0;

            for(int pile : piles){
                hours+=(pile+mid-1)/mid; //get ceil(pile/mid)
            }

            if(hours<=h){
                answer = mid;
                right=mid-1; //if got a satisfactory answer then look for smaller speeds
            }
            else{
                left=mid+1;  //if speed less then increase it
            }
        }
        return answer;
    }
}
