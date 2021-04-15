//Kadanes find subarray
public class Kadanes
{
	public static void main(String[] args) {
	    int[] arr = {-2,-3,4,-1,-2,1,5,-3};
	    System.out.println(kadanes(arr));
	}
	
	public static int kadanes(int[] arr){
	    int maxSum = -10;
	    int currSum = 0;
	   
	    for(int i=0; i<arr.length; i++){
	        currSum += arr[i];
	        if(currSum > maxSum){
	            maxSum = currSum;
	        }
	       
	        if(currSum < 0){
	            currSum = 0;
	        }
	    }
	    return maxSum;
	}
}