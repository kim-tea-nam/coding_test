import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int [] narr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++){
      narr[i] = Integer.parseInt(st.nextToken());
    }
    int max = narr[0];
    int min = narr[0];

    for (int i = 0; i < n; i++) {
      if (max < narr[i]) {
        max = narr[i];
      } else if (min > narr[i]) {
        min = narr[i];
      }
    }

    System.out.println(min + " " + max);

  }

}
