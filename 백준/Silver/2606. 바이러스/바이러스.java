import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 첫째 줄 컴퓨터 수
    // 둘째 줄 부터 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어짐
    // 그 수만큼 한줄에 한쌍씩 컴퓨터의 번호 쌍이 주어짐
    int cn = Integer.parseInt(br.readLine()); // 컴퓨터 수
    int nn = Integer.parseInt(br.readLine()); // 네트워크 수

    int[][] graph = new int[cn+1][cn+1];
    for(int i = 0; i < nn; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      graph[a][b] = 1;
      graph[b][a] = 1;
    }

    System.out.println(bfs(cn, graph));
  }

  public static int bfs(int cn, int[][] graph) {
    // 감염 경우의 수 카운터
    int count = 0;
    // 감염 체크
    boolean[] visited = new boolean[cn+1];
    Queue<Integer> queue = new LinkedList<>();

    queue.add(1);
    visited[1] = true;

    while(!queue.isEmpty()){
      int cur = queue.poll();

      for(int com = 1; com <=cn; com++){
        if(graph[cur][com] == 1 && !visited[com]){
          queue.add(com);
          visited[com] = true;
          count++;
        }
      }
    }

    return count;
  }

}