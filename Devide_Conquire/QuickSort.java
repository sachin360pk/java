package Devide_Conquire;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={8,7,9,5,9,4,7,3,5,2,6,5,1,0};
        int n=arr.length;
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println();
        quickSort(arr, 0, n-1);
        printArray(arr);
    }
    static void quickSort(int arr[],int start,int end){
        if(start<end) {
            int p=partition(arr,start,end);
            quickSort(arr, start, p-1);
            quickSort(arr, p+1, end);
        }
    } 
        
    static int partition(int arr[],int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }

        }
        swap(arr, i+1, end);
        return i+1;
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}
