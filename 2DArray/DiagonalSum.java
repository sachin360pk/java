public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {5,6,7},
                    {9,10,11}};
        int ans=digonalSum(arr);
        System.out.println(ans);
        
    }
    private static int digonalSum(int[][] arr) {
        //method-1
        int n=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //primary diagonal
            sum+=arr[i][i];
            //Secondary diagonal
            if(i!=arr.length-i-1)
               sum+=arr[i][n-i-1];
        }
        return sum;
    }
}
