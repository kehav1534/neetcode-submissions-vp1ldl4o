/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        long mid = ((long)left+(long)right)/2;
        int guessedNumber = guess((int)mid);
        while(guessedNumber!=0 && left<=right){
            if(guessedNumber==1) left = (int)(mid+1);
            else right = (int)(mid -1) ;
            mid = ((long)left+(long)right)/2;
            guessedNumber = guess((int)mid);
        }
        return (int)mid;
    }
}