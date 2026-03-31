class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int left = 0;
        int right = people.length-1;
        while(left<=right){
            if(left==right){
                count++;
                break;
            }
            else if(people[left]+people[right]<=limit){
                count++;
                left++;
                right--;
                continue;
            }
            else if(people[right]<=limit){
                count++;
                right--;
            }
        }
        return count;



        // Map<Integer, Integer> map = new HashMap<>();
        // int count = 0;
        // for(int i = 0; i<people.length; i++){
        //     if(people[i]==limit){
        //         count++;
        //         continue;
        //     }
        //     if(map.containsKey(people[i])){
        //         map.replace(people[i], map.get(people[i])+1);
        //     }
        //     else
        //         map.put(people[i], 1);
        // }
        // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     int find = limit-entry.getKey();
        //     if(entry.getValue()!=0 && map.containsKey(find)){
        //         if(find==entry.getKey()&&entry.getValue()>1){
        //             map.replace(find, entry.getValue()-2);
        //             count++;
        //             continue;
        //         }
        //         if(entry.getValue()>0 && map.get(find)<1){
        //             count+=entry.getValue();
        //         }
        //         if()

        //     }
        // }
    }
}