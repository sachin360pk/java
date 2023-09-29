import java.util.Scanner;
import java.util.*;
class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter the number:");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("number is palindrme");
        }
        else{
            System.out.println("number is not palindrome");
        }

    }
}