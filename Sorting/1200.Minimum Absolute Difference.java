class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        List<List<Integer>> lt = new ArrayList<>();
        for(int i = 0; i<arr.length-1; i++){
            int diff = arr[i+1] - arr[i];
            mindiff = Math.min(mindiff,diff);
        }
        for(int i = 0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])==mindiff){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                lt.add(pair);
            }
        }
        return lt;
    }
}
