
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lst = new ArrayList<>();
        rec(lst, candidates, target, 0, new ArrayList<>(), 0);
        return lst;
    }
    
    void rec(List<List<Integer>> lst, int[] arr, int k, int i, List<Integer> sub, int sum){
        if(i>arr.length||sum>k) return;
        if(sum==k){
            lst.add(new ArrayList<>(sub));
            return;
        }
        for(int j = i; j < arr.length; j++){
            if(j>i && arr[j]==arr[j-1]) continue;
            if(arr[j]>k) break;
            sub.add(arr[j]);
            rec(lst, arr, k, j+1, sub, sum+arr[j]);
            sub.removeLast();
        }
        return;
        
    }
}