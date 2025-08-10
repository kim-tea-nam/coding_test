import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int total = 0;
    int n = Integer.parseInt(br.readLine());

    String s = br.readLine();
    for (int i = 0; i < n; i++) {
      total += Integer.parseInt(s.split("")[i]);
    }

    System.out.print(total);

  }

}
