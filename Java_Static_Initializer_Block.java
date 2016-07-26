import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
      public static int B=0;
      public static int H=0;
      public static boolean flag = flag1();
      public static boolean flag1(){
          Scanner input =new Scanner(System.in);
           B =input.nextInt();
           H =input.nextInt();
        if(B>0 && H>0){
           return true;
        }else{
            System.out.print("java.lang.Exception: Breadth and height must be positive");
            return false;
        }
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
