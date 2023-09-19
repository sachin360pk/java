package Devide_Conquire;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={8,7,9,5,9,4,7,3,5,2,6,5,1,0};
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println();
        int n=arr.length;
        sort(arr,0,n-1);
        System.out.println("Sorted Array:");
        printArray(arr);

    }
    static void sort(int arr[],int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }

    }
    static void merge(int arr[],int start,int mid,int end){
        int n1=mid-start+1;
        int n2=end -mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[start+i];
        }

        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }

    
        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}
