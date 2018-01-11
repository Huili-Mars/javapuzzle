import java.util.*;
import java.io.*;

public class Solution {

	static int minNum(int A, int K, int P) {
		
		int minDay = 1;
		int constantA = A;
		int constantK = K;

		if(A>=K) {
			return -1;
		}
		
		while((A+P)>=K) {
			
			A = A+constantA;
			K = K+constantK;
			minDay++;
		}


		return minDay;
	}
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int K = sc.nextInt();		
		int P = sc.nextInt();
		
		sc.close();
		
		int days = minNum(A,K,P);
		
		System.out.println(days);
	}

}