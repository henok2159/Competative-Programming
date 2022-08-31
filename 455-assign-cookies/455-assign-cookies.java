
public class Solution{
public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res=0, j=0;
        for (int greed:g){
            while (j<s.length&&greed>s[j]) j++;
            if (s.length==j) break;
            res++; j++;
        }
        return res;
    }
}