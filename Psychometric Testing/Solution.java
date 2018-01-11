import java.io.*;
import java.util.*;


public class Solution {

	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		int[] jobOffer = new int[lowerLimits.length];
		
		for(int i=0; i<lowerLimits.length; i++) {
			jobOffer[i] = 0;
			for(int j=0; j<scores.length; j++) {
				if(scores[j]<= upperLimits[i] && scores[j] >= lowerLimits[i]) {
					jobOffer[i]++;
				}
			}
		}
			
		return jobOffer;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int totalscores=sc.nextInt();
		int[] scores = new int[totalscores];
		
		for(int i=0; i<totalscores; i++) {
			scores[i] = sc.nextInt();
		}
		
		int noLowerLimit = sc.nextInt();
		int[] lowerLimits = new int[noLowerLimit];
		for(int j=0; j<noLowerLimit; j++) {
			lowerLimits[j] = sc.nextInt();
		}
		
		int noUpperLimit =  sc.nextInt();
		int[] upperLimits = new int[noUpperLimit];
		for(int k=0; k<noUpperLimit; k++) {
			upperLimits[k] = sc.nextInt();
		}
		
		sc.close();
		System.out.println(Arrays.toString(jobOffers(scores,lowerLimits,upperLimits)));

	}

}
