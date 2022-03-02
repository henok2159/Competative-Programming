class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int left=0;
        int right=piles.length-1;
        int maxCoin=0;
        while(right>left){
           maxCoin+= piles[right-1];
           left++;
           right-=2;
        }
return  maxCoin; 
    }
}
