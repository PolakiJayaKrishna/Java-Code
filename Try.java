public class Try {
    public static void main(String[]args){
        String s = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        System.out.println(s==s2);
        System.out.println(s==s3);
    }
}