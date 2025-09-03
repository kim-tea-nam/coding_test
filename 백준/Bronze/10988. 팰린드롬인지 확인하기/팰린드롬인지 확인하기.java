import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    String[] split = s.split("");
    int flag = 1;

    for(int i = 0; i < s.length()/2; i++) {
      if (!split[i].equals(split[s.length() - i - 1])) {
        flag = 0;
        break;
      }

    }
    System.out.println(flag);
  }
}




