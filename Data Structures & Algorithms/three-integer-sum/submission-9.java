class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        MergeSort(nums, 0, nums.length - 1);

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate i values
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];

                if (total == 0) {
                    arr.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates AFTER adding
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (total < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return arr;
    }

    void MergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, i = 0;

        while (left <= mid && right <= high) {
            temp[i++] = arr[left] <= arr[right] ? arr[left++] : arr[right++];
        }
        while (left <= mid) temp[i++] = arr[left++];
        while (right <= high) temp[i++] = arr[right++];

        for (int j = low, k = 0; j <= high; j++, k++) {
            arr[j] = temp[k];
        }
    }
}
