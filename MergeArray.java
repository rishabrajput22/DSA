 //Merge Array
import java.util.*;
public class MergeArray
{
	public static void main(String[] args) {
	    ArrayList<Integer> list1 = new ArrayList<>();
	    list1.add(10);
	    list1.add(20);
	    list1.add(50);
	    list1.add(80);
	   
	    ArrayList<Integer> list2 = new ArrayList<>();
	    list2.add(30);
	    list2.add(35);
	    list2.add(40);
	    list2.add(60);
	    list2.add(65);
	    list2.add(90);
	   
	    System.out.println(mergeList(list1,list2));
	}
	
	public static ArrayList<Integer> mergeList(ArrayList<Integer>list1, ArrayList<Integer>list2){
	   
	    int ptr1 = 0;
	    int ptr2 = 0;
	    ArrayList<Integer> ans = new ArrayList<>();
	    while(ptr1 < list1.size() && ptr2 < list2.size()){
	        if(list1.get(ptr1) < list2.get(ptr2)){
	            ans.add(list1.get(ptr1));
	            ptr1++;
	        } else {
	            ans.add(list2.get(ptr2));
	            ptr2++;
	        }
	    }
	   
	    while(ptr1 < list1.size()){
	        ans.add(list1.get(ptr1));
	        ptr1++;
	    }
	    while(ptr2 < list2.size()){
	        ans.add(list2.get(ptr2));
	        ptr2++;
	    }
	    return ans;
	}
}
