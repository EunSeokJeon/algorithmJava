package myDynamicProgram;

import java.util.Scanner;

/*
 * 카드 구매하기
 * https://www.acmicpc.net/problem/11052
 */

public class Problem11052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] d = new int[n+1];
		int[] a = new int[n+1];

		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			d[i]=a[i];
		}

		
		
		
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i; k++) {				
					d[i] = Math.min(d[i], d[i-k]+a[k]);				
			}
		}

		System.out.println(d[n]);
		sc.close();

	}
}