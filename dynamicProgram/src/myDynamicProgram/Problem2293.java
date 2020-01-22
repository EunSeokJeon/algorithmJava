package myDynamicProgram;

import java.util.Scanner;


/*
 * 문제 제목 : 동전1
 * https://www.acmicpc.net/problem/2293
 */	

public class Problem2293 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] d = new int[k+1];
		int[] coin = new int[n];

		for(int i = 0 ; i<n ; i++) {
			coin[i]=sc.nextInt();
		}
		d[0]=1;
		

		
		for(int i = 0; i < n ; i++) {
			for(int j = 1 ; j<=k ; j++) {
				if(j-coin[i]>=0)
				d[j]+=d[j-coin[i]];
			}
		}
		System.out.println(d[k]);
	}
}
