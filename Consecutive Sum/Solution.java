import java.io.*;
import java.util.*;

public class Solution{
	
	private static Scanner sc;

	static int consecutive(long num){
		int wayscount=0,sum=0,j=0;
		
		for(int i=1; i<num; i++) {
			sum=i;
			j=i+1;
			
			while(sum<num) {
				sum = sum + j;
				j++;
			}
			
			if(sum == num) {
				wayscount++;
			}
		}
		
		return wayscount;
	}
	
	public static void main(String args[])throws IOException {
	   sc = new Scanner(System.in);
	   long n= sc.nextLong();
	   
	   int noOfWays = consecutive(n);
	   System.out.println(noOfWays);
	}
}
