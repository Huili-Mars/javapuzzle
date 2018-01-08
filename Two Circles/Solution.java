import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

	static String[] circles(String[] info) {
		
		String[] results = new String[info.length];
		
		for(int i=0; i<info.length; i++) {
			String[] circleinfo = info[i].split("\\s+");

			int x1 = Integer.parseInt(circleinfo[0]);
			int y1 = Integer.parseInt(circleinfo[1]);
			int r1 = Integer.parseInt(circleinfo[2]);
			
			int x2 = Integer.parseInt(circleinfo[3]);
			int y2 = Integer.parseInt(circleinfo[4]);
			int r2 = Integer.parseInt(circleinfo[5]);
				
				
				//Touching Internally/Externally
				double xy_distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
				double r1r2_internal = Math.abs(r2 - r1);
				double r1r2_external = Math.abs(r1 + r2);
			
				
				if(xy_distance == r1r2_internal || xy_distance == r1r2_external) {
					results[i] = "Touching";
				}
				//If XY is in between internal & external
				else if(xy_distance > r1r2_internal && xy_distance < r1r2_external) {
					results[i] = "Intersecting";
				}
				//If Two circles are concentric
				else if(x1 == x2 && y1 == y2) {
					results[i] = "Concentric";
				}
				//If disjoint inside
				else if(xy_distance <= r1r2_internal ) {
					results[i] = "Disjoint Inside";
				}
				//If disjoint outside
				else if(xy_distance > r1r2_external) {
					results[i] = "Disjoint Outside";
				}
		}
		
		return results;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Please enter number of test cases:");
		int testcase = sc.nextInt();
		
		String[] info = new String[testcase];
		
		for(int i=0; i<testcase; i++) {
			
			System.out.println("Please enter circles information for "+i+":");
			info[i] = sc2.nextLine();
			
		}
		
		sc.close();
		sc2.close();
		
		String[] results = new String[testcase];
		results = circles(info);
		
		for(int j=0; j<results.length; j++) {
			System.out.println(results[j]);
		}

		
	}

}
