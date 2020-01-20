package dynamicProgram;

import java.util.Scanner;

public class Problem9095 {

	/*
	 * 1,2,3 더하기
	 * https://www.acmicpc.net/problem/9095
	 */	
	
	// d[n]=n을 1,2,3의 조합으로 나타내는 방법의 수
	// d[n]=d[n-1]+d[n-2]+d[n-3]
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int[] d = new int[11];
	        d[0] = 1;
	        for (int i=1; i<=10; i++) {
	            for (int j=1; j<=3; j++) {
	                if (i-j >= 0) {
	                    d[i] += d[i-j];
	                }
	            }
	        }
	        int t = sc.nextInt();
	        while (t-- > 0) {
	            int n = sc.nextInt();
	            System.out.println(d[n]);
	        }
	    }
}
