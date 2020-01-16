package dynamicProgram;

import java.util.Scanner;

public class Problem1699 {

	/*
	 * �������� ��
	 * https://www.acmicpc.net/problem/1699
	 */	

	
	// D[i]=i�� �������� ������ ��Ÿ���� ��, �ʿ��� ���� �ּ� ����
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