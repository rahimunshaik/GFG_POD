https://practice.geeksforgeeks.org/problems/quick-sort/1
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low < high) {
            int partiIndex = partition(arr, low, high);
            quickSort(arr, low, partiIndex - 1);
            quickSort(arr, partiIndex + 1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[high];
        int i = low - 1, j;
        for(j = low; j < high; j ++) {
            if(arr[j] <= pivot) {
                i ++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i ++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return i;
    } 
