class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lst = new ArrayList<>();
        comb(lst, 1, n, k, new ArrayList<>());
        return lst;
    }

    public void comb(List<List<Integer>> lst, int i, int n, int k, List<Integer> temp){
        if(i > n+1 ) return;
        if(temp.size()==k){
            lst.add(new ArrayList<>(temp));
            return;
        }
        temp.add(i);
        comb(lst, i+1, n, k, temp);
        temp.removeLast();
        comb(lst, i+1, n, k, temp);
        return;
    }
}