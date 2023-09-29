public class LinearSearch{
    public static int linearSearch(int arr[],int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={6,5,7,8,4,9,3,2,0};
        int res=linearSearch(arr,3);
        System.out.println(res);
    }
}