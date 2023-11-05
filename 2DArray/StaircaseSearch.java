public class StaircaseSearch{
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}}; 
        int key=29;
        boolean ans=stairSearch(arr,key);
        System.out.println(ans);
    }
    static boolean stairSearch(int[][] matrix,int key){
        //matrix row wise short and col wise short
        int r=0,c=matrix[0].length-1;//we start searching from top right of matrix
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==key)  return true;
            else if(key<matrix[r][c])  c--;
            else  r++;
        }
        return false;
    }
}