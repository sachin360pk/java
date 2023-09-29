public class frequency {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,3,4,4,3,2,5,6,4,5,7,6,5,4,5,4,7,10,10,10,8,8,8,8};
        int fr[]=new int[arr.length];
        int visited=-1;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited){
                fr[i]=count;
            }
        }
        for(int i=0;i<fr.length;i++){
            if(fr[i]!=visited){
                System.out.print(" "+arr[i]+"--->"+fr[i]);
            }
            System.out.println();
        }
    }
}
