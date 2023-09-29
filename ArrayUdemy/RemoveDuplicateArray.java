public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int arr[]={0,0,1,2,1,4,3,4,5,6,6};
        int curr=arr[0];
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(curr==arr[i]){
                continue;
            }
            else{
                arr[count]=arr[i];
                curr=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
