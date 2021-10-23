package Experiment2;

public class BubbleSort {

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

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {2, 5, 6, 1, 50, 24, 4};
        int n = arr.length;
        System.out.print("Unsorted Array: ");
        ob.printArray(arr, n);
        ob.bubbleSort(arr);
        System.out.print("Sorted Array: ");
        ob.printArray(arr, n);
    }
}









