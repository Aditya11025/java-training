//import java.util.Scanner;
public class array {
    public static void main(String[] args) {
       /*  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
            */
    int target=9;
    int[] arr={1,2,3,4,5,6,7,8,9};
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
}
