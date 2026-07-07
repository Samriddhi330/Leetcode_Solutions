class Solution {
    public int majorityElement(int[] nums) {
        bubble(nums);
        return nums[nums.length/2];
    }
    void bubble(int[] arr){
        //run the steps n-1 times
        boolean swapped;
        for(int i= 0;i<arr.length-1;i++){
            //for each step,max item occurs at the last respective index
            swapped = false;
            for(int j = 1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular i, it means the array is already sorted,hence stop the program
            if(swapped==false){
                break;
            }
        }
    }
    
}
