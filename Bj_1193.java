import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Bj_1193 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     int X = Integer.parseInt(br.readLine());
     
     int cross_cnt = 1, prev_cnt_sum = 0;
     
     while (true){
       if(X <= prev_cnt_sum + cross_cnt){
         if(cross_cnt % 2 == 1){
           System.out.print((cross_cnt-(X - prev_cnt_sum -1)) + "/" + (X - prev_cnt_sum));
           break;
         }
         else{
           System.out.print((X-prev_cnt_sum)+"/"+(cross_cnt-(X-prev_cnt_sum-1)));
           break;
         }
       }
       else{
         prev_cnt_sum += cross_cnt;
         cross_cnt++;
       }
     }
  }
}