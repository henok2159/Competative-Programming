 public static void countSwaps(List<Integer> a) {
        int count=0;
               
        boolean isSwapped;
        Integer[] aa= a.toArray(new Integer[0]);
        int n=aa.length;
        for(int i=0;i<n;i++){
            isSwapped=false;
            for(int j=0;j<n-1;j++){
                if(aa[j]>aa[j+1]){
                    isSwapped=true;
                    count++;
                    int temp=aa[j];
                    aa[j]=aa[j+1];
                    aa[j+1]=temp;

                }
            }
            if(!isSwapped){
                break;
            }
        }
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: " +aa[0]);
        System.out.println("Last Element: "+aa[n-1]);
       

    
    }
