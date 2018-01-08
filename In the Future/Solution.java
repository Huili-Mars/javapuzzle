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
		
		System.out.println("Please enter number of problems Asha solves per day:");
		int A = sc.nextInt();
		System.out.println("Please enter number of problems Kelly solves per day:");
		int K = sc.nextInt();		
		System.out.println("Please enter number of problems Asha solves ahead of Kelly:");
		int P = sc.nextInt();
		
		sc.close();
		
		int days = minNum(A,K,P);
		
		if(days == -1) {
			System.out.println("It is impossible for Kelly to surpass Asha");
		}
		else {
			System.out.println("Mininum days required:"+days);
		}
	}

}