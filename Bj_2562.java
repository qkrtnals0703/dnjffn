import java.util.Scanner;
public class Bj_2562{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] N = new int[10];
    
    for(int i=0; i<9; i++){
      N[i] = sc.nextInt();
    }
    int max = -1;
    int i1 = 0;
    for(int i=0; i<9; i++){
      if(max < N[i]){
        max = N[i];
        i1 = i+1;
      }
    }
    System.out.println(max);
    System.out.println(i1);
  }
}