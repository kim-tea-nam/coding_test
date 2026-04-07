import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int[][] arr = new int[9][9];
    int max = 0;
    int r = 0;
    int c = 0;

    for(int i =0; i <9; i++){
      st = new StringTokenizer(br.readLine());
      for(int j =0; j <9; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
        if(max <= arr[i][j]){
          max = arr[i][j];
          r = i+1;
          c = j+1;
        }
      }
    }

    System.out.println(max);
    System.out.println(r + " " +c);
  }
}