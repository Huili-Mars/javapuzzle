import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

	static String winner(int[] andrea, int[] maria, String s) {
		String winner = "";
		int scoreM=0;
		int scoreA=0;
		
		for(int i=0; i<andrea.length; i++) {
			
			if(s.equals("EVEN")) {
				
				if(i % 2 == 0) {
					scoreA += andrea[i] - maria[i];
					scoreM += maria[i] - andrea[i];
				}
			}
			else if(s.equals("ODD")){
				if(i % 2 == 1) {
					scoreA += andrea[i] - maria[i];
					scoreM += maria[i] - andrea[i];
				}
			}
			
		}
		
		if(scoreM > scoreA) winner = "Maria";
		else if(scoreM < scoreA) winner = "Andrea";
		else if(scoreM == scoreA) winner = "Tied";
		
		return winner;
	}

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int andrea = sc.nextInt();
		int[] andreaDices = new int[andrea];
		for(int i=0; i<andrea; i++) {
			andreaDices[i] = sc.nextInt();
		}
		
		int maria = sc.nextInt();
		int[] mariaDices = new int[maria];
		for(int i=0; i<maria; i++) {
			mariaDices[i] = sc.nextInt();
		}
		
		String gamemode = sc.next().toUpperCase();
		
		sc.close();
		
		String gameWinner = winner(andreaDices,mariaDices,gamemode);
		
		System.out.println(gameWinner);
	}

}
