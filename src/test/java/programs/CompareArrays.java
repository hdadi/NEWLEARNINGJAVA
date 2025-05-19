package programs;
import java.util.Arrays;
public class CompareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int[] arr1 = {1, 2, 3, 4, 5};
		        int[] arr2 = {1, 2, 3, 4, 5};
		        int[] arr3={1,2,3,2,1};
//		        boolean isSubset = Arrays.asList(Arrays.stream(arr1).boxed().toArray(Integer[]::new))
//		                .containsAll(Arrays.asList(Arrays.stream(arr2).boxed().toArray(Integer[]::new)));
//
//		        System.out.println("arr2 is a subset of arr1: " + isSubset);		        
		        
		        boolean result=CompareArrays.compareArrays(arr1,arr3);
		        System.out.println("comparision of two arrays were: "+result);
		    }
	
	public static boolean compareArrays(int[] arr1, int[] arr2){
	       boolean flag;
	       for(int i=0;i<arr2.length;i++) {
	    	   flag=false;
	    	   for(int j=0;j<arr1.length;j++) {
	    		   if(arr2[i]==arr1[j]) {
	    			   flag=true;
	    			   break;
	    		   }
	    	   }
	    		   if(!flag) {
	    			   return false;
	    		   }	    	    	   	    	   
	       }
		return true;	    
	}
	
	
//	public static boolean compareArrays(int[] mainSet, int[] subset) {	    	
//    	int mainLength=mainSet.length;
//    	int subLength= subset.length;
//    	boolean found;
//    	for(int i=0;i<subLength;i++) {
//    		found=false;
//    		for(int j=0;j<mainLength;j++) {
//    			if(subset[i]==mainSet[j]) {
//    				found=true;
//    				break;
//    			}
//    		}
//    		if(!found) {
//    			return false;
//    		}	    		
//    	}
//		return true;	    	
//    }
	      
}

