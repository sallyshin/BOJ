import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Num_2580 {

    public static int[][] arr = new int[9][9];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br;

        for(int i = 0; i < 9; i++){
            br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        sudoku(0,0);

    }
    public static void sudoku(int row, int col){
        if(col == 9){
            sudoku(row+1, col);
            return;
        }
        if(row == 9){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb.toString());
            System.exit(0);
        }
        if(arr[row][col] == 0){
            for(int i = 1; i <= 9; i++){
                if(check(row, col, i)){
                    arr[i][j] = i;
                    sudoku(row, col + 1);
                }
            }
        // arr[row][col] = 0;
        // return;
        // }       

        // sudoku(row, col + 1);
    }
    public static boolean check(int row, int col, int val){
        
        for(int i = 0; i < 9; i++){
            if(arr[row][i] == val){
                return false;
            }
        }
        
        for(int i = 0; i < 9; i++){
            if(arr[i][col] == val){
                return false;
            }
        }

        int square_row = (row / 3) * 3;
        int square_col = (col / 3) * 3;

        for(int i = square_row; i < square_row + 3; i++){
            for(int j = square_col; j < square_col + 3; j++){
                if(arr[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }

}