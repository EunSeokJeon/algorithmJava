package dynamicProgram;

import java.io.IOException;
import java.util.Scanner;

public class Problem11055 {

	/*
	 * ���� �� �����ϴ� �κ� ����
	 * https://www.acmicpc.net/problem/11055
	 */	

	
	
	//D[i]=A[1], ... , A[i] ���� ������ ���� ��, A[i]�� ���������� �ϴ� ���� �� �����ϴ� �κ� ������ ����
    
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[n];
        for (int i=0; i<n; i++) {
            d[i] = a[i];
            for (int j=0; j<i; j++) {
                if (a[j] < a[i] && d[i] < d[j]+a[i]) {
                    d[i] = d[j]+a[i];
                }
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