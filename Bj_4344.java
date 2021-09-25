import java.util.Scanner;
public class Bj_4344{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int C = scanner.nextInt();
    int[] arr;
    
    for(int i=0; i<C; i++){
      int N = scanner.nextInt();
      arr = new int[N];
      double sum = 0;
      for(int j=0; j<N; j++){
        int val = scanner.nextInt();
        arr[j] = val;
        sum += val;
      }
      double avg = (sum / N);
      double cnt = 0;
      for(int j=0; j<N; j++){
        if(arr[j] > avg){
          cnt++;
        }
      }
      System.out.printf("%.3f%%\n",(cnt/N)*100);
    }
    scanner.close();
  }
}