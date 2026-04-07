import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] arr = new String[5];
    int max =0;
    for(int i =0; i<5;i++) {
      arr[i] = br.readLine();
      if(max < arr[i].length()){
        max = arr[i].length();
      }
    }

    for(int j =0; j<max;j++){ //세로 읽기 첫번째문자열 길이만큼 반복
                                          // 첫번째 문자열이 아니라 제일 긴 문자열로 해야함
      for(int k =0; k<5; k++){
        // 중간에 없는 문자열은 접근하면 에러나기 때문에 검증을 해야함
        if(arr[k].length() <= j){ // 문자열 길이와 j는 인덱스라서 +1이라고 생각하면
          continue;               // 문자열 길이와 j가 같으면 j가 1크기 때문에
        }                         // 문자 길이가 짧아서 j인덱스 열 k행에 문자가 없음
        System.out.print(arr[k].charAt(j));
      }
    }

  }
}