//Buy sell stock
public class Buy_sell_Stock
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int arr[] = {7,1,5,2,3,9};
        stocks(arr);
	}
	
	public static void stocks(int[] arr){
	    int currMin = arr[0];
	    int maxProfit = 0;
	    for(int i=1; i<arr.length; i++){
	        if(arr[i] > currMin){
	            int profit = arr[i] - currMin;
	            maxProfit = Math.max(maxProfit, profit);
	        }
	        currMin = Math.min(currMin, arr[i]);
	    }
	    System.out.println(maxProfit);
	}
}