import java.util.Scanner;
public class Bj_2577{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   sc.close();
   int[] cnt = new int[10];
   int n = a * b * c;
   while(n>0){
     cnt[n % 10]++;
     n /= 10;
   }
   for(int i=0; i<cnt.length; ++i){
     System.out.println(cnt[i]);
   }
 } 
}