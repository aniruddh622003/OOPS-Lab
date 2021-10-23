package Experiment3;

public class BinarySearch {
    void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    void printArray(int arr[], int size){
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Find x in arr
    int binarySearch(int arr[], int left, int right, int x){
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);
            return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 5, 6, 1, 50, 24, 4};
        int n = arr.length;
        ob.bubbleSort(arr);
        ob.printArray(arr, n);
        //Find 6 in sorted array
        int x = 6;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not found");
        else
            result += 1;
            System.out.println("Element found at position " + result);
    }
}




