package dynamicProgram;

import java.util.Scanner;

public class Problem2579 {

	/*
	 * 계단 오르기
	 * https://www.acmicpc.net/problem/2579
	 */	
	
	//D[i][j] = i번째 계단에 올라갔을 때, 최대 점수. i번째 계단은 j개 연속해서 올라온 계단임
	
	//D[i][0]=0개 연속 -> i번째 계단에 올라가야 하기 때문에 불가능한 경우
	//D[i][1]=1개 연속 -> i-1번째 계단은 밟으면 안됨 = Max(D[i-2][1], D[i-2][2]) + A[i]
	//D[i][2]=2개 연속 -> i번째 계단은 밟아야 하고, 반드시 1개 연속해서 올라온 계단이어야 함 D[i-1][1]+A[i]
    public static void main(String args[]) {
    	/*
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] d = new int[n+1][3];
        d[1][1] = a[1];
        for (int i=2; i<=n; i++) {
            d[i][2] = d[i-1][1] + a[i];
            d[i][1] = Math.max(d[i-2][1], d[i-2][2]) + a[i];
        }
        System.out.println(Math.max(d[n][1], d[n][2]));
        */
    	
    	//D[i] = 1개 연속 => i-1 밟지 않아야 함 D[i-2]+A[i]
    	//D[i] = 2개 연속 => i-1 밟고 i-2밟지 않아야 함 D[i-3]+A[i-1]+A[i]
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[n+1];
        d[1] = a[1];
        d[2] = a[1]+a[2];
        for (int i=3; i<=n; i++) {
            d[i] = Math.max(d[i-2]+a[i], d[i-3]+a[i-1]+a[i]);
        }
        System.out.println(d[n]);
    }
}
