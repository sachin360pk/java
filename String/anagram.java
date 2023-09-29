import java.util.Arrays;
public class anagram {
    public static void isAnagram(String str1,String str2){//two string are anagram if they contains 
        String s1=str1.replaceAll("\\S"," ");       //same set of character but in defferent order
        String s2=str2.replaceAll("\\S"," ");
        boolean status=true;
        if(s1.length()!=s2.length()){
            status=false;
        }
        else{
            char[] arr1=s1.toLowerCase().toCharArray();
            char[] arr2=s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            status=Arrays.equals(arr1,arr2);
        }
        if(status){
            System.out.println(str1+" and "+str2+" are anagram ");
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagram");
        }

    }
    public static void main(String[] args) {
        isAnagram("keep","peek");
        isAnagram("sach","peek");
        isAnagram("sachin","peek");
    }
}
