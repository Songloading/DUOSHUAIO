
public class MaximizeDistancetoClosestPerson {
/**
 * In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty. 

There is at least one empty seat, and at least one person sitting.

Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 

Return that maximum distance to closest person.


Input: [1,0,0,0,1,0,1]
Output: 2
Explanation: 
If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
If Alex sits in any other open seat, the closest person has distance 1.
Thus, the maximum distance to the closest person is 2.
 */
	
	
	 public int maxDistToClosest(int[] seats) {
	        int count=0;
	        int countl=0;
	        int countr=0;
	        for(int i =0; i<seats.length; i++){
	        
	            if(seats[i]==0)
	                countl++;
	            if(seats[i]==1)
	                countl=0;
	            
	            for(int n=i; n<seats.length; n++){
	                if(seats[n]==0){
	                    countr++;
	                }else{
	                    
	                    break;
	                }
	            }
	            if(i==seats.length-1&&seats[i]==0){
	                if(count < countl) count = countl;
	            }
	            if(i==0&&seats[i]==0){
	                if(count < countr) count = countr;
	            }
	            if (count < Math.min(countl, countr)) count=Math.min(countl, countr);
	            countr=0;
	        }
	        return count;
	 }
	 /**
	  * Find the pattern 1001, 100 ,001
	  */
}
