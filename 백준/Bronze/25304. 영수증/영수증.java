import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int amount = sc.nextInt(); // 총 금액
    int purchased = sc.nextInt();   // 구매한 물건 종류 수
    int total = 0;

    for (int i = 0; i < purchased; i++) {
      int price = sc.nextInt();
      int num = sc.nextInt();

      total = total +(price * num);
    }
    if (total == amount) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
