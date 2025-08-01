import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    float[] arr = new float[n];
    float avg = 0;
    int max = 0;
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) {
      int a = Integer.parseInt(st.nextToken());
      if( a > max) {
        max = a;
      }
      arr[i] = a;
    }

    for (int i = 0; i < n; i++) {
      arr[i] = (arr[i]/max) *100;
      avg = avg + arr[i];
    }

    System.out.println(avg/n);

  }

}
