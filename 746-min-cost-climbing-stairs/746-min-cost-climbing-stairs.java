class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []tcost=new int[cost.length];
        if(cost.length<3){
            return Math.min(cost[0],cost[1]);
        }
        tcost[0]=cost[0];
        tcost[1]=cost[1];
        for(int i=2;i<tcost.length;i++){
        tcost[i]=Math.min(tcost[i-1],tcost[i-2])+cost[i];
        }
        return Math.min(tcost[tcost.length-1],tcost[tcost.length-2]);
    }
}