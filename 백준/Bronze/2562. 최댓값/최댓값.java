import java.io.*;
import java.rmi.server.ExportException;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] narr  = new int[9];

    for(int i = 0; i < narr.length; i++ ) {
      int n = Integer.parseInt(br.readLine());

      narr[i] = n;

    }
    int max = narr[0];
    int count = 1;
    for (int i = 0; i < narr.length; i++) {
      if (narr[i] > max) {
        max = narr[i];
        count = i+1;
      }
    }

    System.out.println(max + "\n" + count);


  }

}
