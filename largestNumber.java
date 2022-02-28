class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String [] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb=new StringBuilder();
        for(String stb:s){
sb.append(stb);
        }
        String result =sb.toString();
        return result.startsWith("0")?"0":result;
    }
}
