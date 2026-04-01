import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[][] grid = new int[n][n]; // 입력 첫번째 줄에 게임 구역 크키
    for(int i = 0; i<n; i++){ // 게임판 구역 입력
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j = 0; j<n; j++) {
        grid[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    System.out.println(bfs(n,grid));

  }

  public static String bfs(int n, int[][] grid) {
    // 방문 체크
    boolean visited[][] = new boolean[n][n];
    // bfs 큐 생성
    Queue<int[]> queue = new LinkedList<>();
    // 시작점 설정
    queue.add(new int[]{0,0});
    // 쩨리 이동 하면서 범위체크 및 방문 여부 확인

    while(!queue.isEmpty()){
      int[] current = queue.poll();
      int r = current[0];
      int c = current[1];
      int jump = grid[r][c];

      if(jump == 0){
        continue;
      }

      if(jump == -1){
        return "HaruHaru";
      }

      int[][] dits = {{0,jump}, {jump,0}};
      for(int[] dit : dits){
        int nr = r + dit[0];
        int nc = c + dit[1];

        if((nr >=0 && nr <n) && (nc >=0 && nc <n)){
          if(!visited[nr][nc]){
            visited[nr][nc] = true;
            queue.add(new int[]{nr, nc});
          }
        }
      }

    }

    //
    return "Hing";

  }

}




