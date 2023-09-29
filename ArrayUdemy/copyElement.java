public class copyElement {
    static int[] copyElementAll(int arr[]){
        int b[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            b[i]=arr[i];             
        }
        return b;

    }

    public static void main(String[] args) {
        int arr[]={11,22,13,14,1,5,16,66,77,88};
        int result[]=copyElementAll(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(result[i]);

        }
    }
}
