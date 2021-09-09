import java.io.*;
import java.util.StringTokenizer;

class Nun_15650 {

    static StringBuilder sb;
    static int[] ans;
    static int n, m;
    static int depth = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        ans = new int[m];

        dfs(1, 0);
        System.out.print(sb.toString());
    
    }

    static void dfs(int at, int depth){
        if(depth == m){
            for(int val : ans){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = at; i <= n; i++){
            ans[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }

}