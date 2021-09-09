import java.util.StringTokenizer;
import java.io.*;

class Num_15651{

    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(0);
        System.out.print(sb.toString());

    }

    static void dfs(int depth){

        if(depth == m){

            for(int val : arr){
                sb.append(val).append(' ');
            }
            sb.append('\n');

            return;
        }

        for(int i = 0; i < n; i++){
            arr[depth] = i+1;
            dfs(depth+1);
        }
    }
}