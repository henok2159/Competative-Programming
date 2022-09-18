class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int []left=new int[height.length];
        int []right=new int[height.length];
        left[0]=0;
        right[n-1]=0;
        int max=0;
        for(int i=1;i<n;i++){
         max=Math.max(max,height[i-1]);
            left[i]=max;
        }
        max=0;
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,height[i+1]);
            right[i]=max;
        }
        
        int totalAmount=0;
        for(int i=0;i<n;i++){
            totalAmount=totalAmount+Math.max(0,Math.min(left[i],right[i])-height[i]);
        }
       
       
        return totalAmount;
    }
}