//Merge Sort
class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums, nums.length);
        return nums;
    }

    public void MergeSort(int[] arr, int size){
        MS(arr, 0, size-1);
    }
    public void MS(int[] arr, int low , int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        MS(arr, low, mid);
        MS(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public void merge(int[] arr, int low, int mid, int high){
        int count = 0;
        int[] temp = new int[high - low + 1];
        int i = 0 ;
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left]<=arr[right]){
                temp[i++] = arr[left++];
            }
            else{
                temp[i++] = arr[right++];
            }
        }
        while(left<= mid){
            temp[i++] = arr[left++];
        }
        while(right<= high){
            temp[i++] = arr[right++];
        }
        i = 0;
        for(int j = low; j <= high; j++){
            arr[j] = temp[i++];
        }
    }
}
