//Trapping Rain Water
public class TrappingRainWater
{
	public static void main(String[] args) {
	    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
	    trap(height);
	}
	
	public static void trap(int[] height){
	    int n = height.length;
	    int[] lHeight = new int[n];
	    int[] rHeight = new int[n];
	    int ans = 0;
	   
	    lHeight[0] = height[0];
	    for(int i=1; i<n; i++){
	        lHeight[i] = Math.max(lHeight[i-1],height[i]);
	    }
	   
	    rHeight[n-1] = height[n-1];
	    for(int i=n-2; i>=0; i--){
	        rHeight[i] = Math.max(rHeight[i+1], height[i]);
	    }
	   
	    for(int i=0; i<n; i++){
	        int minWall = Math.min(lHeight[i], rHeight[i]);
	       
	        if(minWall > height[i]){
	            ans += minWall - height[i];
	        }
	    }
	    System.out.println(ans);
	   
	   
	}
}