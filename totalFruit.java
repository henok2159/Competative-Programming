class Solution {
    public int totalFruit(int[] fruits) {
        int j=0;
        int i=0;
        int fruit1=fruits[0];
        int fruit2=fruits[0];
        int l1=0;
        int l2=0;
        int longest=0;
        while(j<fruits.length){
            if(fruit1==fruit2){
                fruit2=fruits[j];
                l1=l2;
                l2=j;
                j++;
            }
            else if(fruit1==fruits[j])
            
            {
                l1=j;
               j++; 
            }
            else if(fruit2==fruits[j])
            
            {
                l2=j;
               j++; 
            }
            else
            {
             longest=Math.max(longest,j-i);  
                System.out.println(j+"  "+i);
                if(l1>l2){
                    fruit2=fruits[j];
                    i=l2+1;
                }
                else{
                     fruit1=fruits[j];
                    i=l1+1;
                }
                
            }
        }
        longest=Math.max(longest,j-i);   
        return longest;
    }
}
