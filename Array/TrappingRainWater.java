package Array;

public class TrappingRainWater {
    static int TrappedWater(int height[]){
        int n=height.length;
        //left boundary array
        int left[]=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        //right boundary array
        int right[]=new int[n];
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        //main logic
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(left[i],right[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int ans=TrappedWater(height);
        System.out.println(ans);
    }
}
