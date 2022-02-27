class Solution
{
	int  select(int arr[], int i)
	{
	    for(int j=i;j<arr.length;j++){
	        if(arr[i]>arr[j]){
	            i=j;
	        }
	    }
	    return i;
        
	}
	
	void selectionSort(int arr[], int n)
	{
	   for(int i=0;i<n;i++){
	      int selectedElement=select(arr,i) ;
	      int temp=arr[i];
	       arr[i]=arr[selectedElement];
	      arr[selectedElement]=temp;
	   }
	}
}
