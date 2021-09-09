import java.io.*;

/**
 * N-Queen : back-tracking 
 */

class Num_9663 {

    public static int n;
    public static int count = 0;
    public static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        nQueen(0);
        System.out.println(count);

    }

    public static void nQueen(int depth){
        if(depth == n){
            count++;
            return;
        }
        for(int i = 0; i < n; i++){
            arr[depth] = i;

            if(check(depth)) { // depth행에 놓는게 확인되면, 놓아도 되면
                nQueen(depth+1);
            }
        }

    }
    static boolean check(int row){
        for(int i = 0; i < row; i++){
            if(arr[row] == arr[i]){
                return false;
            }
            else if(Math.abs(row - i) == Math.abs(arr[row] - arr[i])){
                return false;
            }
        }
        return true;
    }
}