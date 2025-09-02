import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    int[] arr = {1, 1, 2, 2, 2, 8};
    int[] rarr = new int[6];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < rarr.length; i++){
      rarr[i] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0; i < rarr.length; i++){
      bw.write(arr[i]-rarr[i] + " ");

    }

    bw.flush();
    br.close();
    bw.close();
  }
}




