class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int count = 0;
        int l = 0;
        int r = people.length-1;
        while(l<=r){
            if(people[l]+people[r] > limit && people[r]<=limit){
                    r--;
                }
            else if(r==l)
                r--;
            else if(people[l]+people[r]<=limit){
                l++;
                r--;
            }

            count++;
        }
        return count;
    }
}