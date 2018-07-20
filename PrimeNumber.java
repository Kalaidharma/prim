import java.util.*;
public class PrimeNumber {
	public static void main(String[] args){
	int count=0;
		for(int i=10;i<=99;i++)
		{
			for(int j=1;j<=i;j++){
		
				if(i%j==0){
					count++;
					}}}
		
				if(count==2){
					
					System.out.print("the given number is prime no");
				}
				else{
					System.out.print("the given number is not a prime no");
				}
			
		}
	}


