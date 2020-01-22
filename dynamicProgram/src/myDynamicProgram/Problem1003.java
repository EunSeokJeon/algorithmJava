package myDynamicProgram;

import java.util.Scanner;

/*
 * 피보나치 함수
 * https://www.acmicpc.net/problem/1003
 */	



public class Problem1003 {
    static int[][] res = new int[41][2];
    public static void main(String[] args) {
        res[0][0] = 1;
        res[1][1] = 1;
        for(int i = 2; i < 41; i++) {
            for(int j = 0; j < 2; j++) {
                res[i][j] = res[i-1][j] + res[i-2][j];
            }
            
        }
 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
                int n = sc.nextInt();
                System.out.println(res[n][0] + " " + res[n][1]);
        }
        
        
        sc.close();
    }
}
