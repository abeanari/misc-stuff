import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] newarray = new int[n][n];
        //System.out.print(n);
        for (int i=0; i<= n-1; i++){
            for (int j=0; j<= n-1; j++){
                newarray[i][j] = in.nextInt();
            }
        }
        solution(newarray,n);
        
     
    }
   public static void solution(int[][] array, int n){
       int diag1, diag2;
       diag1=0;
       diag2=0;
       for (int i=0; i<n; i++){
           diag1 += array[i][i];
           diag2 += array[i][n-1-i];
       }
       System.out.print(Math.abs(diag1-diag2));
   } 
}