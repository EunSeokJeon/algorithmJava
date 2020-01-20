package dynamicProgram;

import java.util.Scanner;

public class Problem2011 {

	/*
	 * 암호코드
	 * https://www.acmicpc.net/problem/2011
	 */	

	
	//D[i]=i번째 문자까지 해석했을 때, 나올 수 있는 해석으 ㅣ가짓 수
	public static int mod = 1000000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int n = s.length();
        s = " " + s;
        int[] d = new int[n+1];
        d[0] = 1;
        for (int i=1; i<=n; i++) {
            int x = s.charAt(i) - '0';
            if (1 <= x && x <= 9) {
                d[i] += d[i-1];
                d[i] %= mod;
            }
            if (i==1) {
                continue;
            }
            if (s.charAt(i-1) == '0') {
                continue;
            }
            x = (s.charAt(i-1)-'0')*10 + (s.charAt(i)-'0');
            if (10 <= x && x <= 26) {
                d[i] += d[i-2];
                d[i] %= mod;
            }
        }
        System.out.println(d[n]);
    }
}