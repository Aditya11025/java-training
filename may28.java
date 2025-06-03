import java.util.HashMap;

public class may28 {
    public static void main(String[] args) {
        // String str="programming";
        // HashMap<Character, Integer> map = new HashMap<>();
        // char[] arr = str.toCharArray();
        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i], map.get(arr[i]) + 1);
        //     } else {
        //         map.put(arr[i], 1);
        //     }
        // }
        // for(char key : map.keySet()) {
        //     System.out.println(key + " : " + map.get(key));
        // }
        // String str = "programming is a fun is a programming";
        // HashMap<String, Integer> map = new HashMap<>();
        // String[] words = str.split(" ");
        // for (String word : words) {
        //     if (map.containsKey(word)) {
        //         map.put(word, map.get(word) + 1);
        //     } else {
        //         map.put(word, 1);
        //     }
        // }
        // for(String key : map.keySet()) {
        //     System.out.println(key + " : " + map.get(key));
        // }
         String str="aaabcccdddeeef";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(char key : map.keySet()) {
            if(map.get(key)==1){
                System.out.println(key);
                break;
            }
        }
}
}
