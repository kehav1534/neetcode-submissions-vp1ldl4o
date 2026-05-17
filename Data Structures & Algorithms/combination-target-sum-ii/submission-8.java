class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0,
                new ArrayList<>(),
                result);

        return result;
    }

    public void backtrack(int[] candidates,
                          int target,
                          int start,
                          List<Integer> subset,
                          List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // skip duplicate values
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // pruning
            if (candidates[i] > target) {
                break;
            }

            subset.add(candidates[i]);

            backtrack(candidates,
                    target - candidates[i],
                    i + 1,
                    subset,
                    result);

            subset.remove(subset.size() - 1);
        }
    }
}