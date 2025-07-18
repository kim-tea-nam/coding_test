import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int m = sc.nextInt();
    int t = sc.nextInt();

    int ht = t/60; // 입력한 시간을 60으로 나눈 값(시)
    int mt = t%60; // 입력한 시간을 60으로 나눈 나머지 값(분)

    h = h + ht;
    m = m + mt;
    if (m >=60){
      h = h+1;
      m = m%60;
    }
    if(h>=24){
      h = h-24;
    }

    System.out.println(h + " " + m);


  }

}
