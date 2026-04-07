import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[][] Aarr = new int[n][m];

    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<m; j++){
        Aarr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<m; j++){
        int value = Integer.parseInt(st.nextToken());
        System.out.print(Aarr[i][j] + value + " ");
      }
      System.out.println();
    }
  }
}