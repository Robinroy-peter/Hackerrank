/* Coded by Robinroy peter 9/9/2016 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(B.length()+A.length());
        if(B.length()>A.length()){
            System.out.println("Yes");}
        else{
            System.out.println("No");}
        String d = String.valueOf(B.toUpperCase().charAt(0));
        String f = String.valueOf(A.toUpperCase().charAt(0));
        for(int y=1;y<B.length();y++){
            d += B.charAt(y);
        }
        for(int w=1;w<A.length();w++){
            f += A.charAt(w);
        }
        System.out.println(f+" "+d);
    }
}
