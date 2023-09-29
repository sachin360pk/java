public class ArrayReverse {
    public static void rotateArray(int arr[],int d){
        //approach 1:using temp array
        int temp[]=new int[arr.length];
        int n=arr.length;
        int k=0;
        for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    static void approach2(int arr[],int d){
         //approach 2:rotate one by one
         for(int j=0;j<d;j++){
            int temp=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
             }
             arr[arr.length-1]=temp;
         }
    }
   static void approach3(int arr[],int d){
    //A Juggling Algorithm
    
   }
    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        printArray(arr);
        // rotateArray(arr,2);
        // System.out.println();
        // printArray(arr);
        approach2(arr,2);
        System.out.println();
        printArray(arr);

    }
}
