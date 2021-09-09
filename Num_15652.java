import java.util.*;
import java.io.*;

class Num_15652 {

    static int n,m;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(1,0);

        System.out.print(sb.toString());

    }
    public static void dfs(int at, int depth){

        if(depth == m){
            for(int val : arr){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = at; i <= n; i++){
            arr[depth] = i;
            dfs(i, depth+1);
        }
    }
}