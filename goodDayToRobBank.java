class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
       int n=security.length;
        int [] left=new int [n]; 
        int []right =new int [n];
        int []counter=new int[n];
        int []cr=new int[n];
        cr[n-1]=1;
        //counter[0]=1;
        for(int i=0;i<n-1;i++){
            if(security[i]>=security[i+1])counter[i]=1;
            if(security[i]<=security[i+1])cr[i]=1;
        }
        
    int l=0;int r=0;
        int sum=0;
        while(r<n){
            if(r>=time){
               if(sum==time)left[r]=1;
                sum=sum+counter[r++]-counter[l++];
            }
            else {
                sum=sum+counter[r];
                left[r]=0;
                r++;
            }
        
        }
        l=0;r=0;sum=0;
        while(r<n){
            if(r>=time){
              if(sum==time)right[l]=1;
               
                sum=sum+cr[r++]-cr[l++];
                
            }
            else{
                sum=sum+cr[r++];
            }
            
        }
        ArrayList <Integer>ar=new ArrayList();
        for(int i=0;i<n;i++){
           if(right[i]==1&&left[i]==1)ar.add(i); 
            System.out.println(cr[i]+"  "+counter[i]);
        }
       
        return ar;
    }
}
