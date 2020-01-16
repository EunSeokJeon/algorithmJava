package dynamicProgram;

import java.util.Scanner;

public class Problem1699 {

	/*
	 * 제곱수의 합
	 * https://www.acmicpc.net/problem/1699
	 */	

	
	// D[i]=i를 제곱수의 합으로 나타냈을 때, 필요한 항의 최소 개수
	// Min(D[i-k^2]+1)=D[i]
	// k<=sqrt(N);
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        for (int i=1; i<=n; i++) {
            d[i] = i;
            for (int j=1; j*j <= i; j++) {
                if (d[i] > d[i-j*j] + 1) {
                    d[i] = d[i-j*j] + 1;
                }
            }
        }
        System.out.println(d[n]);
    }
}