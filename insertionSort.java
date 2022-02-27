public static void insertionSort1(int n, List<Integer> arr) {
        boolean in0=false;
    Integer[] aa= arr.toArray(new Integer[0]);
    int unsortN=aa[n-1];
    for(int i=n-1;i>0;i--){
        
        if(unsortN<aa[i-1]){
            aa[i]=aa[i-1];
            for(int k=0;k<aa.length;k++){
           System.out.print(aa[k]+" "); 
        }
        System.out.println();
            
        }
        else{
            in0=true;
            
            aa[i]=unsortN;
             for(int k=0;k<aa.length;k++){
           System.out.print(aa[k]+" "); 
        }
        System.out.println();
          
        break;
           
        }
       
    }
     if(!in0){
            aa[0]=unsortN;
              for(int k=0;k<aa.length;k++){
           System.out.print(aa[k]+" "); 
        }
        System.out.println();
        }

    }
