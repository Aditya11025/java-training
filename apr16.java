public class apr16 {
    public static void main(String[] args) {
        int a=123;
        int res=0;
        while(a>0){
            int digit=a%10;
            res+=digit;
            a=a/10;
        }
        System.out.println(res);
    }
}
