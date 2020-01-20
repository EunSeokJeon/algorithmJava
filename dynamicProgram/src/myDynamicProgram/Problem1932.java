package myDynamicProgram;

import java.util.*;

/*
 * 정수 삼각형
 * https://www.acmicpc.net/problem/1932
 */
//d[n][i] : n번째 줄에서 i를 더했을 때의 최대 
//d[n][i] = Max(d[n-1][i] + a[n][i] , d[n-1][i] + a[n][i+1])

public class Problem1932 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] d = new int[n][n];
		int[][] value = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++)
				value[i][j] = sc.nextInt();
		}

		d[0][0]=value[0][0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (j == 0) {
					d[i][j]=d[i-1][j] + value[i][j];
				} else if (j == i) {
					d[i][j]=d[i-1][j-1]+value[i][j];
				} else {
					d[i][j] = Math.max(d[i - 1][j - 1] + value[i][j], d[i - 1][j] + value[i][j]);
				}

			}
		}
		// d[n-1][j]의 맥스 출력
		int result = -1;
		
			for (int j = 0; j < n; j++) {
				if (d[n-1][j] > result) {
					result = d[n-1][j];
				}
			
		}
		System.out.println(result);
		
	}
}
