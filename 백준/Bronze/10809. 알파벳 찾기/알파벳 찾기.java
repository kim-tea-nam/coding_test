import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    String abc = "abcdefghijklmnopqrstuvwxyz";
    String s = br.readLine();

    boolean flag = false;

    for (int i = 0; i < abc.length(); i++) {
      for (int j = 0; j < s.length(); j++) {
        if(abc.charAt(i) == s.charAt(j)) {
          System.out.print(j + " ");
          flag = false;
          break;
        } else {
          flag = true;
        }
      }
      if(flag) {
        System.out.print(-1 + " ");
      }
      flag = false;
    }
  }

}


