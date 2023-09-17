package Array;

public class BinarySearchArray {
    static int bSearch(int arr[],int key){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(end+start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int index=bSearch(arr, 7);
        System.out.println(index);
    }
    
}
