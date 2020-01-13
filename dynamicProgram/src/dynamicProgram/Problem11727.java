package dynamicProgram;

import java.util.Scanner;

public class Problem11727 {

	/*
	 * 2 x n 타일링(2)
	 * https://www.acmicpc.net/problem/11727
	 */	
	
	// D[n]=2*n채우는 방법의 수
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n = 15;
		int[]d =new int[1001];
		d[0]=1;
		d[1]=1;
		for(int i = 2; i<=n ; i++) {
			d[i]=d[i-1]+d[i-2]*2;
			d[i]%=10007;
		}
		
		System.out.println(d[n]);
		
		
	}
}
