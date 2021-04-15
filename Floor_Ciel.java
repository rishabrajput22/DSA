prev - floor next - seal

public class Main
{
	public static void main(String[] args) {
		int [] arr = {0,11,22,23,24,25,37,48,59,60};
		int key=58;
		int lo=0;
		int hi = arr.length-1;
		
		while(lo<=hi)
		{
		    int mid = lo + (hi-lo)/2;
		    if(key < arr[mid])
		    {
		        hi = mid-1;
		    }
		    else if(key > arr[mid])
		    {
		        lo = mid+1;
		    }
		}
	//	System.out.println(hi + " " + lo );
	    System.out.println("Floor : " + hi);
	    System.out.println("Ceil : " + lo);
	    	   // System.out.println("Floor : " + arr[hi]);
	   // System.out.println("Ceil : " + arr[lo]);
	}
}

public class Main
{
	public static void main(String[] args) 
	{
            System.out.println(bs());
	}
	
	public static int bs()
	{
	    int[] arr = {0,1,2,3,4,5,7,8,9,10};
	    int key = 6;
	    int start = 0; 
	    int end = arr.length-1;
	    int mid = -1;
	    while(start <= end)
	    {
	       mid = (start + end) / 2; //mid=6;
	        if(arr[mid] == key)
	        {
	            return mid;
	        }
	        if(mid != arr.length -1 && arr[mid + 1] == key)
	        {
	            return mid + 1;
	        }
	        if(mid != 0 && arr[mid - 1] == key)
	        {
	            return mid - 1;
	        }
	        else if(key < arr[mid])
	        {
	            end = mid - 1;
	        }
	        else{
	            start = mid + 1;
	        }
	        
	    }
	    return mid;
	}
}

public class Main
{
	public static void main(String[] args) 
	{
            System.out.println(bs());
	}
	
	public static int bs()
	{
	    int[] arr = {0,1,2,3,4,6,5,7,8,9,10};
	    int key = 6;
	    int start = 0; 
	    int end = arr.length-1;
	    int mid = -1;
	    while(start <= end)
	    {
	       mid = (start + end) / 2; //mid=6;
	        if(arr[mid] == key)
	        {
	            return mid;
	        }
	        if(mid != arr.length -1 && arr[mid + 1] == key)
	        {
	            return mid + 1;
	        }
	        if(mid != 0 && arr[mid - 1] == key)
	        {
	            return mid - 1;
	        }
	        else if(key < arr[mid])
	        {
	            end = mid - 1;
	        }
	        else{
	            start = mid + 1;
	        }
	        
	    }
	    return mid;
	}
}