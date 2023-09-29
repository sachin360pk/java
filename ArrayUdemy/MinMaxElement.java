public class MinMaxElement{
    static class pair{
        int min;
        int max;
    }
    static pair getMinMax(int arr[],int n){
        pair minmax=new pair();
        if(n==1){
            minmax.max=arr[0];
            minmax.min=arr[0];
            return minmax;
        }
        if(arr[0]>arr[1]){
            minmax.max=arr[0];
            minmax.min=arr[1];
        }
        else{
            minmax.max=arr[1];
            minmax.min=arr[0];

        }
        for(int i=2;i<n;i++){
            if(arr[i]>minmax.max){
                minmax.max=arr[i];
            }
            if(arr[i]<minmax.min){
                minmax.min=arr[i];
            }
        }
        return minmax;
    }
    public static void main(String[] args) {
        int arr[]={23,78,56,45,33,44,21,14,37};
        int n=arr.length;
        pair minmax=getMinMax(arr,n);
        System.out.println("maximum element is:"+minmax.max);
        System.out.println("minimum element is:"+minmax.min);
    }
}