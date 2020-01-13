package dynamicProgram;

import java.util.Scanner;

public class Problem10844 {

	/*
	 * 쉬운 계단 수
	 * https://www.acmicpc.net/problem/10844
	 */	
	
	// D[N][L] = D[N-1][L-1] + D[N-1][L+1] (1<= L <= 8)
	// D[N][0] = D[N-1][1]
	// D[N][9] = D[N-1][8]
    public static long mod = 1000000000L;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] d = new long[n+1][10];
        for (int i=1; i<=9; i++) {
            d[1][i] = 1;
        }
        for (int i=2; i<=n; i++) {
            for (int j=0; j<=9; j++) {
                d[i][j] = 0;
                if (j-1 >= 0) {
                    d[i][j] += d[i-1][j-1];
                }
                if (j+1 <= 9) {
                    d[i][j] += d[i-1][j+1];
                }
                d[i][j] %= mod;
            }
        }
        long ans = 0;
        for (int i=0; i<=9; i++) {
            ans += d[n][i];
        }
        ans %= mod;
        System.out.println(ans);
    }
}