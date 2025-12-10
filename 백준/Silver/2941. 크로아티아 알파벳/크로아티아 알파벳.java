import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder(br.readLine());
    int count = 0;
    for(int i = 0; i< sb.length(); i++) {

      char ch = sb.charAt(i);

      if(ch == 'c'){
        if(i <sb.length()-1) {
          if(sb.charAt(i+1) == '=') {
            i++;
          } else if(sb.charAt(i+1) == '-') {
            i++;
          }
        }
      }

      else if(ch == 'd') {
        if(i <sb.length()-1) {
          if(sb.charAt(i+1) == 'z') {
            if(i<sb.length()-2) {
              if(sb.charAt(i+2) == '='){
                i +=2;
              }
            }
          } else if(sb.charAt(i+1) == '-') {
            i++;
          }
        }
      }

      else if(ch == 'l') {
        if(i < sb.length()-1) {
          if(sb.charAt(i+1) == 'j') {
            i++;
          }
        }
      }

      else if(ch == 'n') {
        if(i < sb.length()-1) {
          if(sb.charAt(i+1) == 'j') {
            i++;
          }
        }
      }

      else if(ch == 's') {
        if(i < sb.length()-1) {
          if(sb.charAt(i+1) == '=') {
            i++;
          }
        }
      }

      else if(ch == 'z') {
        if(i < sb.length()-1) {
          if(sb.charAt(i+1) == '=') {
            i++;
          }
        }
      }
      count++;
    }

    System.out.println(count);
  }
}




