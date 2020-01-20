package myDynamicProgram;

import java.util.*;

/*
 * RGB거리
 * https://www.acmicpc.net/problem/1149
 */

//d[i][0] = i번째 집을 price[i][0]으로 칠한 최소값

public class Problem1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] price = new int[n+1][3];
		int[][] d = new int[n+1][3];
		for(int i = 1; i<n+1 ; i++) {
			for(int j=0; j<3 ; j++) {
				price[i][j]=sc.nextInt();
			}
		}
		d[0][0]=d[0][1]=d[0][2]=price[0][0]=price[0][1]=price[0][2]=0;
		for(int i = 1; i<n+1 ; i++) {			
				d[i][0]=Math.min(d[i-1][1], d[i-1][2])+price[i][0];
				d[i][1]=Math.min(d[i-1][0], d[i-1][2])+price[i][1];
				d[i][2]=Math.min(d[i-1][0], d[i-1][1])+price[i][2];
		
		}
		if(n==0) {
			System.out.println(0);
		}else {
		System.out.println(Math.min(Math.min(d[n][0],d[n][1]),d[n][2]));
		}
		sc.close();
	}
}
