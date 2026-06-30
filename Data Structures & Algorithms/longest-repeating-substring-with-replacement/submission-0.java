class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();

        int left=0;
        int maxfreq=0;
        int longest=0;

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq = Math.max(maxfreq,map.get(ch));

            //main idea -> windowlength - maxfreq should be <= k, if > k then shrink from left
            while((right-left+1)-maxfreq > k){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }

            longest = Math.max(longest,right-left+1);
        }
        return longest;
    }
}
