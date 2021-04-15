//Target Pair

public class Target_Pair
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int[] arr = {1,3,4,5,6,7,10};
        int target = -9;
        targetPair(target, arr);
	}
	//
	public static void targetPair(int target, int[] arr){
	    int l = 0;
	    int r = arr.length-1;
	    while(l<r){
	        int currSum = arr[l] - arr[r];
	        if(currSum < target){
	            l++;
	        }
	        else if(currSum > target){
	            r--;
	        }
	        else{
	            System.out.println(arr[l]+" "+arr[r]);
	            l++;
	            r--;
	        }
	    }
	}
}