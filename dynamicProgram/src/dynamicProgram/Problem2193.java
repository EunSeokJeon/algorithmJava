package dynamicProgram;

import java.util.Scanner;

public class Problem2193 {

	/*
	 * ��ģ��
	 * https://www.acmicpc.net/problem/2193
	 */	
	
	// D[n]=N�ڸ� ��ģ���� ����
	// n��° �ڸ��� 0
	// n��° �ڸ��� 1
	// D[n] = D[n-1]+D[n-2]
	
	//D[N][L] : N�ڸ� ��ģ��, �������ڸ� L
	//D[N][0] : D[N-1][0] + D[N-1][1]
	//D[N][1] : D[N-1][0]
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long[] d = new long[n+1];
            d[1] = 1;
            if (n >= 2) {
                d[2] = 1;
            }
            for (int i=3; i<=n; i++) {
                d[i] = d[i-1] + d[i-2];
            }
            System.out.println(d[n]);
        
    }
}
