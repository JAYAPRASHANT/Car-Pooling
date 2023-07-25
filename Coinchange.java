package CoinChange;
import java.util.*;
public class Coinchange {
	public static int coinchange(int ar[],int n,int amount) {
		int count=0;
		int sum=0;
		int i=n-1;
		while(sum!=amount&&i>=0) {
		
				if(sum+ar[i]<=amount) {
					sum=sum+ar[i];
					count++;
				}
				else {
					i--;
			}
			
		}
		if(sum==amount) {
			return count;
			
		}
		else {
			return -1;
	
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int amount=sc.nextInt();
		int c=coinchange(ar,n,amount);
		System.out.println(c);

	}

}
