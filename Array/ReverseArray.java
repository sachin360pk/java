package Array;
//reverse array using two pointer approach
public class ReverseArray {
    static void reversearray(int arr[]){
        int n=arr.length;
        int first=0;
        int last=n-1;
        while(first<=last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        printArray(arr);
        System.out.println();
        reversearray(arr);
        printArray(arr);
    }
    
}
