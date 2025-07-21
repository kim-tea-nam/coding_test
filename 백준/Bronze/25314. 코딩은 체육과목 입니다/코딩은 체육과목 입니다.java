import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int quotient = n/4;
    StringBuilder st = new StringBuilder();

    for(int i = 0; i < quotient; i++) {
      st.append("long ");

    }
    st.append("int");
    bw.write(st.toString());
    bw.close();
  }

}
