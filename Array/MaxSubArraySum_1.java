package Array;

public class MaxSubArraySum_1 {
    //brute Force     O(n3)
    private static int maxSum(int arr[]){
        int n=arr.length;
        int max_sum=Integer.MIN_VALUE;
        int curr_sum;
        for(int i=0;i<n;i++){
            int first=i;
            for(int j=i;j<n;j++){
                int last=j;
                curr_sum=0;
                for(int k=first;k<=last;k++){
                   curr_sum+=arr[k];
                }
                max_sum=Math.max(max_sum,curr_sum);
            }
        }
        return max_sum;
    }
    //prefix sum   O(n2)
    private static int maxSumPrefix(int arr[]){
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                curr_sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                max_sum=Math.max(curr_sum,max_sum);

            }
        }
        return max_sum;
    }
    //using kadans Algorithm   O(n)
    static int kadansAlgo(int arr[]){
        int n=arr.length;
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<n;i++){
            curr_sum+=arr[i];
            if(curr_sum<0) curr_sum=0;
            max_sum=Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.println("maximum sum of the subarray in the given array is:");
        System.out.println(maxSum(arr));
        System.out.println("maximum sum of the subarray in the given array using prefix:");
        System.out.println(maxSumPrefix(arr));
        System.out.println("maximum sum of the subarray in the given array using kadans Algo:");
        System.out.println(kadansAlgo(arr));
    }
}
