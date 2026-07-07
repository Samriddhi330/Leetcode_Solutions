class Solution {
    public int search(int[] arr, int target) {
        int pivot = findpivot(arr,0,arr.length-1);
        if(pivot==-1){
            //array is not rotated normal binary search
            return binarysearch(arr, target, 0, arr.length-1);
        }
        if(target==arr[pivot]){
            return pivot;
        }
        if(target>=arr[0]){
            return binarysearch(arr, target, 0, pivot-1);
        }
        return binarysearch(arr, target, pivot+1, arr.length-1);
    }
    int findpivot(int[] arr,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            //4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid]<=arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    int binarysearch(int[] arr, int target, int start, int end){
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
