package dynamicProgram;

import java.util.Scanner;
/*
 * 1�� �����
 * https://www.acmicpc.net/problem/1463
 */
public class Problem1463 {
	static int[] d;
	static int[] u;
	
	
	public static int topDown(int n) {
			
		if(n==1) { //1->1
			return 0;
		}
		
		if(d[n]>0) { //memoization
			return d[n];
		}		
		d[n]=topDown(n-1)+1;
		if(n%2==0) {
			int temp = topDown(n/2) + 1;
			if (d[n] >temp) {
				d[n]=temp;			
			}
		}
		if(n%3==0) {
			int temp = topDown(n/3)+1;
			if(d[n]>temp) {
				d[n]=temp;
			}
		}
		
		return d[n];
	}
	
	public static void bottomUp(int n) {
		u[1] = 0;
		for(int i =2 ; i<=n ; i++) {
			u[i]=u[i-1]+1;
			if(i%2==0 && u[i]>u[i/2]+1) {
				
				u[i]=u[i/2]+1;				
			}
			if(i%3==0 && u[i]>u[i/3] +1 ) {
				
				u[i]=u[i/3]+1;
			}
		}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		d = new int[n+1];
		u = new int[n+1];
		System.out.println(topDown(n));
//		bottomUp(n);
//		System.out.println(u[n]);
		
	}
}

