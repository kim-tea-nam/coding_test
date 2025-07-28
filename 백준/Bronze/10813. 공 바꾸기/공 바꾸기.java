import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[] arr = new int[n];

    for(int i = 0; i < n; i++) {
      arr[i] = i+1;
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int front = Integer.parseInt(st.nextToken());
      int back = Integer.parseInt(st.nextToken());

      int temp = arr[front-1];
      arr[front-1] = arr[back-1];
      arr[back-1] = temp;

    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

  }

}
