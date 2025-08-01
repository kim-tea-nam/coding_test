import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());


    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];

    int temp = 0;

    for(int i = 0; i < n; i++) {
     arr[i] = i+1;
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken())-1;
      int b = Integer.parseInt(st.nextToken())-1;

      while (a < b) {
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        a++;
        b--;
      }
    }

    br.close();

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }


  }

}
