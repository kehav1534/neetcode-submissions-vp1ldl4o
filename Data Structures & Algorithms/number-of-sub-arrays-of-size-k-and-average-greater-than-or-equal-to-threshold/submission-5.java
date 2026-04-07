class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        // Arrays.sort(arr);
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        System.out.println(sum/k);
        count = (sum/k) >= threshold ? 1: 0;
        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            if((sum / k) >= threshold){
                count++;
            }
            System.out.println(sum/k);
        }
        return count;
    }
}