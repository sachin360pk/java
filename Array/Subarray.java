package Array;

public class Subarray{
    private static void SubArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int first=i;
            for(int j=i;j<n;j++){
                int last=j;
                for(int k=first;k<=last;k++){
                   System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        System.out.println("maximum sub array:");
        SubArray(arr);
        
    }
}

