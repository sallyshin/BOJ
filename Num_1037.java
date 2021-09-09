import java.io.*;
import java.util.*;

class Num_1037 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count_divisor = Integer.parseInt(br.readLine());
        
        StringTokenizer divisor  = new StringTokenizer(br.readLine(), " ");
        
        int[] arr = new int[count_divisor];

        for(int i = 0; i < count_divisor; i++){
            arr[i] = Integer.parseInt(divisor.nextToken());
        }
        Arrays.sort(arr);

        answer = arr[0] * arr[arr.length - 1];

        System.out.println(answer);
    }
}