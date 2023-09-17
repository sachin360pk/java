import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> lst=new ArrayList<>();
        int n=matrix.length;     //3
        int m=matrix[0].length;  //4
        int SR=0;   //Starting Row
        int ER=n-1;   //Ending Row
        int SC=0;   //Starting column
        int EC=m-1;   //Ending column

        while(SR<=ER && SC<=EC){
            //top
            for(int i=SC;i<=EC;i++){
                lst.add(matrix[SR][i]);
            }
            //right
            for(int i=SR+1;i<=ER;i++){
                lst.add(matrix[i][EC]);
            }
            //bottom
            for(int i=EC-1;i>=SC;i--){
                if(SR==ER)  break;
                lst.add(matrix[ER][i]);
            }
            //left
            if(SC==EC)  break;
            for(int i=ER-1;i>=SR+1;i--){
                lst.add(matrix[i][SC]);
            }
            SR++;
            SC++;
            ER--;
            EC--;
        }
        return lst;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12}};
        List<Integer> lst=new ArrayList<>();
        lst=spiralOrder(arr);
        System.out.println(lst);

    }
}
