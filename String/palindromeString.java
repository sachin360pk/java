public class palindromeString {
    public static boolean isPalindrome(String str){//palindrome means if we reverse the string then it is same as orginal string
        int n=str.length();                       //the sence of reading from both side is same
        char[] ch=str.toCharArray();
        char res=0;
        for(int i=n;i>0;i--){
          res=ch[i]+res;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="madam";
        String st="sachin";

    }
}
