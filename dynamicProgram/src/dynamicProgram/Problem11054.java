package dynamicProgram;

import java.io.IOException;
import java.util.Scanner;

public class Problem11054 {

	/*
	 * ���� �� �����ϴ� �κ� ����
	 * https://www.acmicpc.net/problem/11053
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
                if (a[j] < a[i] && d[i] < d[j]+1) {
                    d[i] = d[j]+1;
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