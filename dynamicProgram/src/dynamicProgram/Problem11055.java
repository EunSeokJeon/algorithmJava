package dynamicProgram;

import java.io.IOException;
import java.util.Scanner;

public class Problem11055 {

	/*
	 * 가장 긴 증가하는 부분 수열
	 * https://www.acmicpc.net/problem/11055
	 */	

	
	
	//D[i]=A[1], ... , A[i] 까지 수열이 있을 때, A[i]을 마지막으로 하는 가장 긴 증가하는 부분 수열의 길이
    
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