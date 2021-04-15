Next Greater Element
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1,2,0,0,1,3,4};
	    int[] ans = nextLargestElement(arr);
	    for(int i : ans){
	        System.out.print(i+" ");
	    }
	}
	public static int[] nextLargestElement(int[] arr){
	    Stack<Integer> stack = new Stack<>();
	    int[] ans = new int[arr.length];
	    for(int i=arr.length-1; i>=0; i--){
	        if(stack.empty()){
	            ans[i] = -1;
	        }
	        else if(stack.peek() > arr[i]){
	            ans[i] = stack.peek();
	        }
	        else if(stack.peek()<=arr[i]){
    	        while(!stack.empty() && stack.peek()<=arr[i]){
    	            stack.pop();
    	        }
    	        if(stack.empty()){
    	            ans[i] = -1;
    	        }
    	        else if(stack.peek() > arr[i]){
    	            ans[i] = stack.peek();
    	        }
	        }
	        stack.push(arr[i]);
	    }
	    return ans;
	}
}
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1,2,0,0,1,3,4};
	    int[] ans = nextLargestElement(arr);
	    for(int i : ans){
	        System.out.print(i+" ");
	    }
	}
	public static int[] nextLargestElement(int[] arr){
	    Stack<Integer> stack = new Stack<>();
	    int[] ans = new int[arr.length];
	    for(int i=0; i<arr.length; i++){
	        if(stack.empty()){
	            ans[i] = -1;
	        }
	        else if(stack.peek() > arr[i]){
	            ans[i] = stack.peek();
	        }
	        else if(stack.peek()<=arr[i]){
    	        while(!stack.empty() && stack.peek()<=arr[i]){
    	            stack.pop();
    	        }
    	        if(stack.empty()){
    	            ans[i] = -1;
    	        }
    	        else if(stack.peek() > arr[i]){
    	            ans[i] = stack.peek();
    	        }
	        }
	        stack.push(arr[i]);
	    }
	    return ans;
	}
}
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1,2,0,0,1,3,4};
	    int[] ans = nextLargestElement(arr);
	    for(int i : ans){
	        System.out.print(i+" ");
	    }
	}
	public static int[] nextLargestElement(int[] arr){
	    Stack<Integer> stack = new Stack<>();
	    int[] ans = new int[arr.length];
	    for(int i=0; i<arr.length; i++){
	        if(stack.empty()){
	            ans[i] = -1;
	        }
	        else if(stack.peek() < arr[i]){
	            ans[i] = stack.peek();
	        }
	        else if(stack.peek()>=arr[i]){
    	        while(!stack.empty() && stack.peek()>=arr[i]){
    	            stack.pop();
    	        }
    	        if(stack.empty()){
    	            ans[i] = -1;
    	        }
    	        else if(stack.peek() < arr[i]){
    	            ans[i] = stack.peek();
    	        }
	        }
	        stack.push(arr[i]);
	    }
	    return ans;
	}
}
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1,2,0,0,1,3,4};
	    int[] ans = nextLargestElement(arr);
	    for(int i : ans){
	        System.out.print(i+" ");
	    }
	}
	public static int[] nextLargestElement(int[] arr){
	    Stack<Integer> stack = new Stack<>();
	    int[] ans = new int[arr.length];
	    for(int i=arr.length-1; i>=0; i--){
	        if(stack.empty()){
	            ans[i] = -1;
	        }
	        else if(stack.peek() < arr[i]){
	            ans[i] = stack.peek();
	        }
	        else if(stack.peek()>=arr[i]){
    	        while(!stack.empty() && stack.peek()>=arr[i]){
    	            stack.pop();
    	        }
    	        if(stack.empty()){
    	            ans[i] = -1;
    	        }
    	        else if(stack.peek() < arr[i]){
    	            ans[i] = stack.peek();
    	        }
	        }
	        stack.push(arr[i]);
	    }
	    return ans;
	}
}
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int [] arr = {2,1,5,6,2,3};
	   // int [] arr = {2,4};
	    System.out.println(ans(arr));
	}
	
	public static int ans(int[] arr){
	    int[] NSE = NSE(arr);
	    int[] PSE = PSE(arr);
	    int max = 0;
	    for(int i=0; i<arr.length; i++){
	        max = Math.max(arr[i]*(NSE[i]-PSE[i]-1),max);
	    }
	    return max;
	}
	
	
	public static int[] NSE(int[] arr){
	    Stack<Integer> stack = new Stack<>();
	    int[] ans = new int[arr.length];
	    for(int i=arr.length-1; i>=0; i--){
	        if(stack.empty()){
	            ans[i] = arr.length;
	        }
	        else if(stack.peek() < arr[i]){
	            ans[i] = stack.peek();
	        }
	        else if(stack.peek()>=arr[i]){
    	        while(!stack.empty() && stack.peek()>=arr[i]){
    	            stack.pop();
    	        }
    	        if(stack.empty()){
    	            ans[i] = arr.length;
    	        }
    	        else if(stack.peek() < arr[i]){
    	            ans[i] = stack.peek();
    	        }
	        }
	        stack.push(arr[i]);
	    }
	    return ans;
	}
	
	
	public static int[] PSE(int[] arr){
	    Stack<Integer> stack = new Stack<>();
	    int[] ans = new int[arr.length];
	    for(int i=0; i<arr.length; i++){
	        if(stack.empty()){
	            ans[i] = -1;
	        }
	        else if(stack.peek() < arr[i]){
	            ans[i] = stack.peek();
	        }
	        else if(stack.peek()>=arr[i]){
    	        while(!stack.empty() && stack.peek()>=arr[i]){
    	            stack.pop();
    	        }
    	        if(stack.empty()){
    	            ans[i] = -1;
    	        }
    	        else if(stack.peek() < arr[i]){
    	            ans[i] = stack.peek();
    	        }
	        }
	        stack.push(i);
	    }
	    return ans;
	}
}