import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineNumber = 0;
        while(input.hasNext()){
            lineNumber++;
            System.out.println(""+lineNumber+" "+input.nextLine());
        }
    }
}
