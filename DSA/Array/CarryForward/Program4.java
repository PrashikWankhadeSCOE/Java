/*
 * Given a character array of size N 
 * having all lower case elements 
 * return thr count of pair(i,j) such that 
 * a) i<j
 * b) arr[i]=='a'
 *    arr[j] =='g'
 *
 * Arr : [a,b,e,g,a,g]
 * Output : 3;
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                char [] arr = new char [N];
                for(int i = 0;i<N;i++){
                        arr[i] = sc.next().charAt(0);
                }

                System.out.println(perfectMatch(arr,N));
	}
	/*
	 * here iterations are very less but 
	 * TC : O(N^2);
	 * SC = o(1);
	 */
	static int perfectMatch(char [] arr,int N){
		int count = 0;

		for(int i = 0;i<N;i++){
			if(arr[i]=='a'){
		
				for(int j = i+1;j<N;j++){
					if(arr[j]=='g')
						count++;
				}
			}
		}
		return count;
	}
	/*
	 * Now I want to do this same code in 
	 * TC : O(N)
	 * SC : O(1)
	 */

}
