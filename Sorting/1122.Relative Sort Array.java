class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        for(int i = 0; i<arr1.length; i++){
            freq[arr1[i]]++;
        }
        int[] ans = new int[arr1.length];
        int k = 0;
        for(int i = 0;i<arr2.length;i++){
            while(freq[arr2[i]]>0){
                ans[k] = arr2[i];
                k++;
                freq[arr2[i]]--;
            }
        }
        for(int num = 0;num<=1000;num++){
            while(freq[num]>0){
                ans[k] = num;
                k++;
                freq[num]--;
            }     
        }
        return ans;
    } 
}
