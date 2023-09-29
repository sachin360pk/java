public class ReverseString {
    public static void main(String[] args) {
        String s="Sachin Rawat";
        int n=s.length();
        for(int i=n;i>0;i--){
            System.out.print(s.substring(i-1,i));
        }
    }
}
