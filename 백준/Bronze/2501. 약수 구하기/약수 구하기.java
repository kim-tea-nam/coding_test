import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int n, k, divisor;
    ArrayList<Integer> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    k = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      divisor = n % i;
      if (divisor == 0) {
        list.add(i);
      }
    }
    if(list.size() >= k) {
      System.out.println(list.get(k-1));
    } else {
      System.out.println(0);
    }


  }

}
