import java.util.*;
import java.io.*;

public class Solution {

	static int minNum(int A, int K, int P) {
		
		int minDay = 1;
		int sumA = A+P;
		int sumK = K;
		
		if(sumA == sumK) {
			minDay +=1;
		}
		else if(sumA > sumK) {
			minDay += (int)Math.ceil((double)P/(K-A));
		}
		else if(sumA < sumK) {
			minDay = 1;
		}
		else {
			minDay = -1;
		}

		return minDay;
	}
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int K = sc.nextInt();		
		int P = sc.nextInt();
		
		sc.close();
		
		System.out.println(minNum(A,K,P));
	}

}
