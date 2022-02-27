public static List<Integer> countingSort(List<Integer> arr) {
    Integer[] a=arr.toArray(new Integer[0]);
    Integer []countingArray=new Integer[100];
    for(int i=0;i<countingArray.length;i++){
        countingArray[i]=0;
    }
    for(int i=0;i<a.length;i++){
        countingArray[a[i]]++;
    }
    return(Arrays.asList(countingArray));
    }
