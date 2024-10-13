package codilityTest.java;

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		System.out.println(solution.solution(new int[] {1, 3, 6, 4, 1, 2}));
		System.out.println(solution.solution(new int[] {1, 2, 3}));
		System.out.println(solution.solution(new int[] {-1, -3}));
		System.out.println(solution.solution(new int[] {-1000000, 1000000}));
	}


 public int solution(int[] A) {
 	if (A == null || A.length == 0) {
 		return 1;    }

 	boolean[] visitedPositives = new boolean[1000000 + 1];

 	for (int i=0, c=A.length; i < c; ++i) {
 		
 		int current = A[i];
 		
 		if (current > 0) {
 			visitedPositives[current] = true;
 		}
 	}
 	
 	for (int i=1, c=visitedPositives.length; i < c; i++) {
 		if (!visitedPositives[i]) {
 			return i;
 		}
 	}
 	
 	return 10000001;    

 
}

}
