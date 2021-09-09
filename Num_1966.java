/**
 * 1966
 * https://www.acmicpc.net/problem/1966
 * 프린터 큐
 */
import java.io.*;

class Num_1966 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int document = Integer.parseInt(st.nextToken());
            int important = Integer.parseInt(st.nextToken());

            Queue<Integer> que = new LinkedList<>();

            int answer = 0; 

            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < document; j++){
                que.add(Integer.parseInt(st.nextToken()));
            }
            int front = 


        }
        
    }
}