public class minmax {
    static void func(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // for(int i=0 ; i<arr.length-1 ; i++){
        //     for(int j=i ; j<arr.length ; j++){
        //         if(arr[j]>max)
        //           max=arr[j];
        //         if(arr[j]<min)
        //           min=arr[j];
        //     }
        // }
        for(int j=0 ; j<arr.length ; j++){
                    if(arr[j]>max)
                      max=arr[j];
                    if(arr[j]<min)
                      min=arr[j];
                }
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        func(arr);
    }
}
