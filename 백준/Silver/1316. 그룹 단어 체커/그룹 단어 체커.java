import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine()); // 문자 입력 수
    int count = n; // 그룹 단어 갯수

    for(int i = 0; i < n ; i++) { // 입력수 만큼 반복해서
      String s = br.readLine();   // 문자 입력 받기

      for(int j = 0; j < s.length() - 1; j++) { // 문자길이만큼 반복
        if(s.charAt(j) != s.charAt(j+1)) { // 문자가 변경될 때
          String t = s.substring(0, j+1);  // 뒤 문자열 추출
          char nextChar = s.charAt(j+1); // 변경된 문자 추출
          if(t.contains(String.valueOf(nextChar))) {// 그 문자열에 변경된 문자 있는지 검사
            count--;
            break;
          }
        }
      }
    }

    System.out.println(count);
  }
}




