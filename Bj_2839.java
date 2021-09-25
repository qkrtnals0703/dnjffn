import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Bj_2839{
  public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int N = Integer.parseInt(br.readLine());
   int t =0;
   int f = N/5;
   N %= 5;
   while(f>=0){
     if(N%3 == 0){
       t = N/3;
       break;
     } 
     else {
       N += 5;
       f--;
     }
   }
   System.out.println(f+t);
  }
}