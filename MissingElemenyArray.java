Missing element in an array

public class Main
{
	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4,5,7,8,9,10};
		int key=6;
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
		System.out.println(hi + " " + lo );
	}
}
Missing element in an array
public class Main
{
	public static void main(String[] args) {
		int [] arr = {0,11,22,23,24,25,37,48,59,60};
		int key=45;
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
		System.out.println(hi + " " + lo );
	}
}