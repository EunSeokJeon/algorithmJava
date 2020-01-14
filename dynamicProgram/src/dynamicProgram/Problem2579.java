package dynamicProgram;

import java.util.Scanner;

public class Problem2579 {

	/*
	 * ��� ������
	 * https://www.acmicpc.net/problem/2579
	 */	
	
	//D[i][j] = i��° ��ܿ� �ö��� ��, �ִ� ����. i��° ����� j�� �����ؼ� �ö�� �����
	
	//D[i][0]=0�� ���� -> i��° ��ܿ� �ö󰡾� �ϱ� ������ �Ұ����� ���
	//D[i][1]=1�� ���� -> i-1��° ����� ������ �ȵ� = Max(D[i-2][1], D[i-2][2]) + A[i]
	//D[i][2]=2�� ���� -> i��° ����� ��ƾ� �ϰ�, �ݵ�� 1�� �����ؼ� �ö�� ����̾�� �� D[i-1][1]+A[i]
    public static void main(String args[]) {
    	/*
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] d = new int[n+1][3];
        d[1][1] = a[1];
        for (int i=2; i<=n; i++) {
            d[i][2] = d[i-1][1] + a[i];
            d[i][1] = Math.max(d[i-2][1], d[i-2][2]) + a[i];
        }
        System.out.println(Math.max(d[n][1], d[n][2]));
        */
    	
    	//D[i] = 1�� ���� => i-1 ���� �ʾƾ� �� D[i-2]+A[i]
    	//D[i] = 2�� ���� => i-1 ��� i-2���� �ʾƾ� �� D[i-3]+A[i-1]+A[i]
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[n+1];
        d[1] = a[1];
        d[2] = a[1]+a[2];
        for (int i=3; i<=n; i++) {
            d[i] = Math.max(d[i-2]+a[i], d[i-3]+a[i-1]+a[i]);
        }
        System.out.println(d[n]);
    }
}
