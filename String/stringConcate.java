public class stringConcate {
    public static void main(String[] args) {
        //1-->by string Builder()
        StringBuilder s1=new StringBuilder("hiiii");
        StringBuilder s2=new StringBuilder("java");
        StringBuilder s=s1.append(s2);//append method last m jodta h
        System.out.println(s);

        //2-->by format method
        String s3=new String("hellow");
        String s4=new String("world");
        String s5=String.format("%s %s",s3,s4);
        System.out.println(s5);

        //3-->bt join method
        String sa=String.join(" ",s3,s4);
        System.out.println(sa);
    }
}
