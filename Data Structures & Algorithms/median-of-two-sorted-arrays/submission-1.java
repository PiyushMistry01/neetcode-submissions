class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int nums[] = new int[m+n];

        for(int i=0;i<nums1.length;i++){
            nums[i] = nums1[i];
        }

        for(int i=0;i<nums2.length;i++){
            nums[m+i] = nums2[i];
        }

        Arrays.sort(nums);

        int size = nums.length;
        int left = 0;
        int right = nums.length-1;
        if(size%2==0){
            int mid = (left+right)/2;
            double ans = (double) (nums[mid]+nums[mid+1])/2;
            return ans;
        }
        else{
            int mid = (left+right)/2;
            double ans = (double) nums[mid];
            return ans;
        }
    }
}
