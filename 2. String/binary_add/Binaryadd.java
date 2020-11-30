import java.util.Scanner;
import java.lang.Math;
public class prime2 {
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter Test cases");
  int testcase = in.nextInt();
  int[] result = new int[testcase];
  int cnt=0;
  for(int z = 0;z<testcase ;z++)
  { 
      long binary1, binary2;
      int i = 0, remainder = 0;
      int[] sum = new int[20];
      
      System.out.print("Input first binary number: ");
      binary1 = in.nextLong();
      System.out.print("Input second binary number: ");
      binary2 = in.nextLong();

      while (binary1 != 0 || binary2 != 0) 
      {
      sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
      remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
      binary1 = binary1 / 10;
      binary2 = binary2 / 10;
      }
      if (remainder != 0) {
      sum[i++] = remainder;
      }
      --i;
      int a=0;
      int length1 = sum.length-1;
      while (i >= 0) {
      a = Integer.valueOf(String.valueOf(a) + String.valueOf(sum[i--]));  }
        result[cnt] = a;
        cnt++;
        
  }
  int z;
  for(z = 0;z<testcase;z++){
    System.out.println("Result = "+result[z]);
  }
 }
}
