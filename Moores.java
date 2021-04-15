//Moores Algo
public class Moores
{
	public static void main(String[] args) {
	    int [] arr = {3,3,2,1,3,2,2,2,2,2,2,2};
	    majority(arr);
	}
	
	public static void majority(int[] arr){
	    int majIdx = 0;
	    int count = 1;
	   
	    for(int i=1; i<arr.length; i++){
	        if(arr[i] == arr[majIdx]){
	            count++;
	        }
	        else{
	            count--;
	        }
	        if(count == 0){
	            majIdx = i;
	            count = 1;
	        }
	    }
	    System.out.println(arr[majIdx]);
	}
}