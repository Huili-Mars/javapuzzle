import java.io.*;
import java.util.*;

public class Solution2 {
	
	static long waitingTime(int[]tickets,int p) {
		int waitingTime = 0;
		
		while(tickets[p] != 0) {
			for(int i=0; i<tickets.length; i++) {
				if(tickets[i] != 0) {
					tickets[i]-=1;
					waitingTime++;
					if(tickets[p] == 0)
						break;
				}
			}
		}
		
		return waitingTime;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of people in the queue.");
		int totalqueue=sc.nextInt();
		
		int[] tickets = new int[totalqueue];
		
		for(int i=0; i<totalqueue; i++) {
			tickets[i] = sc.nextInt();
		}
		
		int jessepos = sc.nextInt();
		
		sc.close();
		
		System.out.println("Waiting Time:"+waitingTime(tickets,jessepos));
		
	}

}
