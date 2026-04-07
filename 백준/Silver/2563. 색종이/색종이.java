import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());  // 색종이의 수
    int Area = 0;
    StringTokenizer st = null;
    boolean[][] paper = new boolean[100][100];

    for(int i =0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken()); // X
      int y = Integer.parseInt(st.nextToken()); // Y

      for(int j = x; j < x + 10;j++){
        for(int k = y ;k < y+10; k++){
          if(!paper[j][k]){
            paper[j][k] = true;
            Area++;
          }
        }
      }
    }
    System.out.println(Area);
  }
}