import java.io.*;
import java.util.*;


public class Solution {

	private static Scanner sc;

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
		sc = new Scanner(System.in);
		
		boolean bError = true;
		
		do {
			try {
				System.out.println("Please enter number of candidates.");
				int totalscores=sc.nextInt();

				int[] scores = new int[totalscores];
				
				for(int i=0; i<totalscores; i++) {
					scores[i] = sc.nextInt();
				}
				
				//To specify number of elements in Lower Limits and the scores range.
				System.out.println("Please enter number of lower limits of score range.");
				int noLowerLimit = sc.nextInt();
				
				int[] lowerLimits = new int[noLowerLimit];
				for(int j=0; j<noLowerLimit; j++) {
					lowerLimits[j] = sc.nextInt();
				}
				
				
				//To specify number of elements in Upper Limits and the scores range.
				int noUpperLimit=0;
				
				//Check if the number of elements in UpperLimits is same as LowerLimits
				do {
					if(noUpperLimit != 0 && noUpperLimit != noLowerLimit) {
						System.out.println("Please make sure number of elements in upper limits is the same as you have specified in lower limits.\n Please re-enter.");
					}
					System.out.println("Please enter number of upper limits of score range.");
					noUpperLimit= sc.nextInt();
				}
				while(noUpperLimit != noLowerLimit);
				
				
				int[] upperLimits = new int[noUpperLimit];
				for(int k=0; k<noUpperLimit; k++) {
					upperLimits[k] = sc.nextInt();
				}
				
				sc.close();
				System.out.println(Arrays.toString(jobOffers(scores,lowerLimits,upperLimits)));
				bError = false;

			}
			catch(InputMismatchException inputMismatchException)
		    {
		        System.out.printf("Error! You must enter integers");
		        bError = false;

		    }
		
		}
		while(bError);

	}

}
