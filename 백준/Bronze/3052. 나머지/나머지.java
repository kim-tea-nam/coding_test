import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      int A = Integer.parseInt(br.readLine());
      arr[i] = A%42;

    }

    int count = 0;
    boolean bl;
    for(int i = 0; i < arr.length; i++){
      bl = false;
      for (int j = i+1; j < arr.length; j++){
        if(arr[i] == arr[j]){
          bl = true;
          break;
        }
      }

      if(bl == false){
        count++;
      }
    }

    System.out.println(count);



  }

}
