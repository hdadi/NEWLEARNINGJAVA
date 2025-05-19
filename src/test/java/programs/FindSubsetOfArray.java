package programs;

public class FindSubsetOfArray {

	    public static void main(String[] args) {
	        int[] mainArray = {10, 20, 30, 40, 50, 60};
	        int[] subsetArray = {20, 30, 50, 80};

	        boolean isSubset = checkSubset(mainArray, subsetArray);
	        
	        if (isSubset) {
	            System.out.println("Subset array is present in the main array.");
	        } else {
	            System.out.println("Subset array is NOT present in the main array.");
	        }
	    }	    
	    public static boolean checkSubset(int[] mainSet, int[] subset) {	    	
	    	int mainLength=mainSet.length;
	    	int subLength= subset.length;
	    	boolean found;
	    	for(int i=0;i<subLength;i++) {
	    		found=false;
	    		for(int j=0;j<mainLength;j++) {
	    			if(subset[i]==mainSet[j]) {
	    				found=true;
	    				break;
	    			}
	    		}
	    		if(!found) {
	    			return false;
	    		}	    		
	    	}
			return true;	    	
	    }
}
