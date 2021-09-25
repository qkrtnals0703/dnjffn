import java.util.Arrays;
import java.util.Scanner;
public class Bj_1546 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    double[] arr = new double[scanner.nextInt()];
    
    for(int i=0; i<arr.length; i++){
      arr[i] = scanner.nextDouble();
    }
    scanner.close();
    
    double sum = 0;
    Arrays.sort(arr);
    
    for(int i=0; i<arr.length; i++){
      sum += ((arr[i]/arr[arr.length-1])*100);
    }
    System.out.println(sum/arr.length);
  }
}