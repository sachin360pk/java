public class BinarySearch {
    public static int binarySearch(int arr[],int value){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]==value){
                return mid+1;
            }
            else if(value>arr[mid]){
                left=mid+1;
            }
            else if(value<arr[mid]){
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int val=7;
        int res=binarySearch(arr,val);
        System.out.println(res);
    }
}
