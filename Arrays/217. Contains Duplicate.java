//Problem: 217. Contains Duplicate
//Language: Java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //sort the array
        //bubble(nums);
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
    }
    void bubble(int[] arr){
        boolean swapped;
        for(int i = 0;i<arr.length-1;i++){
            swapped = false;
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
}
