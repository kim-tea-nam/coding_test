import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char c = br.readLine().charAt(0);

    int num = (int)c;

    System.out.print(num);

  }

}
