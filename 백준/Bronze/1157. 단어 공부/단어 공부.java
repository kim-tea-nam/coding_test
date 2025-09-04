import java.io.*;
import java.util.Locale;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    int count = 0;
    int max = 0;
    String maxt = "";
    // 단어
    char[] sarr = s.toLowerCase(Locale.ROOT).toCharArray();

    for(int i = 0; i < 26; i++) {
      for (char c : sarr) {
        if (c == (97 + i)) {
          count++;
        }
      }

      if(max < count) {
        maxt = String.valueOf((char)(97 + i));
        max = count;
      } else if (max == count) {
        maxt = String.valueOf('?');
      }

      count = 0;

    }

    System.out.println(maxt.toUpperCase(Locale.ROOT));

  }
}




