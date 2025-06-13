import java.util.HashMap;

public class june12 {
    public static void main(String[] args) {
        // String str="hello";
        // String str1="lloeh";
        // HashMap<Character,Integer>map=new HashMap<>();
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     map.put(ch,map.getOrDefault(ch,0)+1);            
        // }
        // for(int i=0;i<str1.length();i++){
        //     char ch=str1.charAt(i);
        //     if(map.containsKey(ch)){
        //         map.put(ch,map.get(ch)-1);
        //         if(map.get(ch)==0){
        //             map.remove(ch);
        //         }
        //     } else {
        //         System.out.println("Not an anagram");
        //         return;
        //     }
        // }
        // if(map.isEmpty()){
        //     System.out.println("Anagram");
        // } else {
        //     System.out.println("Not an anagram");
        // }

        //spiral order printing of a matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print bottom row if still in bounds
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column if still in bounds
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
