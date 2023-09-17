// import java.util.Scanner;
public class EvenOdd{
    private static boolean check(int num){
       if((num & 1)==0)  return true;
       return false;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        int num=16;
        System.out.println("is "+num+" even number");
        System.out.println(check(num));
    }
}