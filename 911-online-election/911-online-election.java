class TopVotedCandidate {
    int []times;
    int []winner;

    public TopVotedCandidate(int[] persons, int[] times) {
        this.times=times;
        HashMap<Integer,Integer>hm=new HashMap();
        winner=new int[times.length];
        int max=persons[0];
        hm.put(max,1);
        for(int i=1;i<persons.length;i++){
            hm.put(persons[i],hm.getOrDefault(persons[i],0)+1);
            
           
            if(hm.get(max)<=hm.get(persons[i])){
                
                max=persons[i];
            }
            winner[i]=max;
        }
        // for(int i:winner){
        //     System.out.print(i+" ");
        // }
    }
    
    public int q(int t) {
        int low=0;
        int mid=0;
        int high=times.length-1;
        while( low<=high){
           mid=low+(high-low)/2;
            if(times[mid]==t)return winner[mid];
            if(times[mid]>t)high=mid-1;
            if(times[mid]<t)low=mid+1;
        }
        
        return winner[high];
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */