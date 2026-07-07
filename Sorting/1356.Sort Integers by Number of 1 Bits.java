class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                int a = countbits(arr[j]);
                int b = countbits(arr[j+1]);
                if((a>b) || (a==b && arr[j]>arr[j+1])){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    int countbits(int n){
        int count = 0;
        while(n>0){
            if(n%2==1){
                count++;
            } 
            n=n/2;
        }
        return count;
    }
    void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
