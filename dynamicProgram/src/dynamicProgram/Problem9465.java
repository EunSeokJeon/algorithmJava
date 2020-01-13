package dynamicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9465 {

	/*
	 * 스티커
	 * https://www.acmicpc.net/problem/9465
	 */	

	
	
	//D[N][S]=2xN 스티커. N열의 상태가 S. S:0(XX) S:1(OX) S:2(XO)
	//A[i][j] : i열 j행에 들어있는 스티커 점수
	//D[n][0] = Max( D[n-1][0], D[n-1][1], D[n-1][2] )
	//D[n][1] = Max( D[n-1][0], D[n-1][2]+A[n][1] )
	//D[n][2] = Max( D[n-1][0], D[n-1][1]+A[n][2] )
    
	public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine());
        while (t-- > 0) {
            int n = Integer.valueOf(br.readLine());
            long[][] a = new long[n+1][2];
            {
                String[] line = br.readLine().split(" ");
                for (int i=1; i<=n; i++) {
                    a[i][0] = Long.valueOf(line[i-1]);
                }
            }
            {
                String[] line = br.readLine().split(" ");
                for (int i=1; i<=n; i++) {
                    a[i][1] = Long.valueOf(line[i-1]);
                }
            }
            long[][] d = new long[n+1][3];
            for (int i=1; i<=n; i++) {
                d[i][0] = Math.max(d[i-1][0],Math.max(d[i-1][1],d[i-1][2]));
                d[i][1] = Math.max(d[i-1][0],d[i-1][2])+a[i][0];
                d[i][2] = Math.max(d[i-1][0],d[i-1][1])+a[i][1];
            }
            long ans = 0;
            ans = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
            System.out.println(ans);
        }
    }
}