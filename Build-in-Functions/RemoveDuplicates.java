
import java.util.*;

// 19. Remove Duplicates from in 2D Array
// Remove duplicate values from a 2d array.

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Set<Integer> myset = new HashSet<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                myset.add(arr[i][j]);
            }
        }
        System.out.println(myset);
    }
}
