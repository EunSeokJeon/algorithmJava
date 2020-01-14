package dynamicProgram;

import java.util.Scanner;
/*
 * ������
 * https://www.acmicpc.net/problem/1912
 */

	//D[i]=A[i]�� ������ �ִ� ���� ��
	//  1 : A[i-1]�� ������ �����տ� ���ԵǴ� ��� D[i-1]+A[i]
	//  2 : ���ο� �������� �����ϴ� ��� A[i]

public class Problem1912 {	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[n];
        for (int i=0; i<n; i++) {
            d[i] = a[i];
            if (i == 0) {
                continue;
            }
            if (d[i] < d[i-1] + a[i]) {
                d[i] = d[i-1] + a[i];
            }
        }
        int ans = d[0];
        for (int i=0; i<n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        System.out.println(ans);
    }
}

