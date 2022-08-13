public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int mid=0;
        while(low<=n){
           mid=low+(n-low)/2;
            if(isBadVersion(mid))
            {n=mid-1;}
            else{
               low=mid+1; 
            }
        }
        if(isBadVersion(mid))return mid;
        return mid+1;
    }
}
