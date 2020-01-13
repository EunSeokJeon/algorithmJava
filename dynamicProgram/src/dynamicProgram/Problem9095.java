package dynamicProgram;

import java.util.Scanner;

public class Problem9095 {

	/*
	 * 1,2,3 더하기
	 * https://www.acmicpc.net/problem/9095
	 */	
	
	// d[n]=n을 1,2,3의 조합으로 나타내는 방법의 수
	// d[n]=d[n-1]+d[n-2]+d[n-3]
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n = 10;
		int[]d =new int[1001];
		/*
		d[0]=1;
		d[1]=1;
		d[2]=2;
		d[3]=4;
		for(int i = 3; i<=n ; i++) {
			d[i]=d[i-1]+d[i-2]+d[i-3];			
		}
		
		System.out.println(d[n]);
		*/
		
        d[0] = 1;
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=3; j++) {
                if (i-j >= 0) {
                    d[i] += d[i-j];
                }
            }
        }
        
        System.out.println(d[10]);
		
	}
}
