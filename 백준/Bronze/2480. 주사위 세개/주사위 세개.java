import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    int score = 0;

    if(n1 == n2 && n1 == n3){
      score = 10000+(n1*1000);
    } else if (n1 == n2 || n2 == n3){
      score = 1000+(n2*100);
    } else if (n3 == n1){
      score = 1000+(n3*100);
    } else {
      if(n1 > n2 && n1 > n3){
        score = n1*100;
      } else if (n2 > n1 && n2 > n3){
        score = n2*100;
      } else if (n3 > n1 && n3 > n2){
        score = n3*100;
      }
    }

    System.out.println(score);
  }

}
