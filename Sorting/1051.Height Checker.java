class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        int count = 0;
        for (int h : heights) {
                freq[h]++;
        }
        int currentheight = 1;
        for(int i = 0;i<heights.length;i++){
            while(freq[currentheight]==0){
                currentheight++;
            }
            if(currentheight!=heights[i]){
                count++;
            }
            freq[currentheight]--;
        }
        return count;
    }
}
