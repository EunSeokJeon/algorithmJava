package dynamicProgram;

import java.util.Scanner;

public class Problem2133 {

	/*
	 * 타일 채우기( 3 X N )
	 * https://www.acmicpc.net/problem/2133
	 */	

	
	
	//D[n]=3 X n 방법의 수
	//D[n]= 3*D[N-2] + 2*D[N-4] + 2*D[N-6] + ... + 2*D[0]
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] d = new long[n+1];
        d[0] = 1;
        for (int i=2; i<=n; i+=2) {
            d[i] = d[i-2]*3;
            for (int j=i-4; j>=0; j-=2) {
                d[i] += d[j]*2;
            }
        }
        System.out.println(d[n]);
    }
}