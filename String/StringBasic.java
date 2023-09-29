class StringBasic{
    public static void main(String[] args) {
        String str1="Sachin";
        String str2="pawan";
        String str3="SAChIn";
       
        //length of string
        int len=str1.length();
        // System.out.println("length of string is:"+len);
       
        //convert string to char array
        char str[]=str1.toCharArray();
        for(int i=0;i<str.length;i++){
            // System.out.println(str[i]+" ");
        }

        //immutable string String concate by concste(),by + operator
        str1.concat("Rawat");
        // System.out.println(str1);
        // String s=str1.concat("Rawat");
        // System.out.println(s);
        //string concatination operator can concate not only string but primitive values also
        String s1=50+40+"Rawat"+40+40;//before string it simply add and after string its like a another string
        // System.out.println(s1);
        System.out.println(str1+str2+str3);//or String snew=(new StringBuilder()).append("Sachin").append("kumar").toString();
        String snew=(new StringBuilder()).append("Sachin").append("kumar").toString();
        // System.out.println(snew);


        //String comparision by using equals(),compareTo(),== operator
        // System.out.println(str1.equals(str2));
        // System.out.println(str1.equals(str3));
        // System.out.println(str1.equalsIgnoreCase(str3));
        // System.out.println(str1.compareTo(str2));
        // System.out.println(str1.compareTo(str3));
        // System.out.println(str1==str2);

        //substring we have two method
        //1-substring(start index) take sreing to end AND substring(start,end) take middle of string
        String s2="WelcomeToIndia";
        System.out.println(s2.substring(0,7));
        System.out.println(s2.substring(7));


        //split method
        String text=new String("hellow my name is sachin");
        String[] sentence=text.split("\\");
        // System.out.println(Arrays.toString(sentence));
        System.out.println(sentence);



    }
}