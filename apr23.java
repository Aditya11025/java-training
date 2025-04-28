public class apr23 {
    public static void main(String[] args) {
        // String str="hello";
        // String newstr="hel";
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     if(newstr.indexOf(ch)==-1){
        //         newstr+=ch;
        //     }
        // }
        // System.out.println(newstr);

       
        //  String str="helloo";
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     for(int j=i+1;j<str.length();j++){
        //         if(ch==str.charAt(j)){
        //             count++;
        //             if(count>1){
        //                 System.out.println(ch);
        //                 break;
        //             }
        //         }
        //     }
        //}
        String str="helloooll";
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(ch==str.charAt(j)){
                    arr[i]++;
                }
            }
        }
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
       
        System.out.println(str.charAt(index));    
    }
}
