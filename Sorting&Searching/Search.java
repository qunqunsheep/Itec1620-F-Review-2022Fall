public class Search {

	public static int linearSearch(int arr[], int elementToSearch) {

    	for (int index = 0; index < arr.length; index++) {
        	if (arr[index] == elementToSearch)
            return index;
    	}
    	return -1;
    }

    public static int binarySearch(int arr[], int elementToSearch) {

	    int firstIndex = 0;
	    int lastIndex = arr.length - 1;

	    // termination condition (element isn't present)
	    while(firstIndex <= lastIndex) {
	        int middleIndex = (firstIndex + lastIndex) / 2;
	        // if the middle element is our goal element, return its index
	        if (arr[middleIndex] == elementToSearch) {
	            return middleIndex;
	        }

	        // if the middle element is smaller
	        // point our index to the middle+1, taking the first half out of consideration
	        else if (arr[middleIndex] < elementToSearch)
	            firstIndex = middleIndex + 1;

	        // if the middle element is bigger
	        // point our index to the middle-1, taking the second half out of consideration
	        else if (arr[middleIndex] > elementToSearch)
	            lastIndex = middleIndex - 1;

	    }
	    return -1;
	}

	public static int jumpSearch(int[] integers, int elementToSearch) {

	    int arrayLength = integers.length;
	    int jumpStep = (int) Math.sqrt(integers.length);
	    int previousStep = 0;

	    while (integers[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
	        previousStep = jumpStep;
	        jumpStep += (int)(Math.sqrt(arrayLength));
	        if (previousStep >= arrayLength)
	            return -1;
	    }
	    while (integers[previousStep] < elementToSearch) {
	        previousStep++;
	        if (previousStep == Math.min(jumpStep, arrayLength))
	            return -1;
	    }

	    if (integers[previousStep] == elementToSearch)
	        return previousStep;
	    return -1;
	}

	
	public static void main(String[] args) {
		

	}

}
