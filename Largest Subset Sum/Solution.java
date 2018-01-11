import java.io.*;
import java.util.*;

public class Solution {

	static Long[] maxSubsetSum(int[] k) {
		Long[] results = new Long[k.length];
		
		for(int i=0; i<k.length; i++) {
			results[i] = (long) 0;
			for(int j=k[i]; j>0; j--) {
				double divided = (double)k[i]/(double)j;
				if(divided == Math.floor(divided)) {
					results[i] += j;
				}
			}
		}
		
		return results;
	}
	
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		
		int elem = sc.nextInt();
		int[] k = new int[elem];
		
		for(int i=0; i<elem; i++) {
			k[i] = sc.nextInt();
		}
		
		sc.close();
		
		Long[] results = maxSubsetSum(k);
		
		System.out.println(Arrays.toString(results));
		
	}

}
