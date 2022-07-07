class Heap_Sort
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
  
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
  
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
  
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
  
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
  
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
         buildHeap(arr,n);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
  
            heapify(arr, i, 0);
        }
        //code here
    }
 }
