package lab06;

public class MergeSort<E extends Comparable<E>> {

    /** The constant in the formula t = c * O() */
    private double c;

    /** The order O() of the implementation.
        If your implementation is in O(n^2), use Math.pow().
	    @param n index
	    @return the function of n inside the O()
	 */
    public double O(int n) {
        // EXERCISE
        return n * Math.log(n);
    }

    /** Calculates the constant c using a given input array of type E.
        Units of time should be converted to microseconds
    */
    public void fit(E[] array) {
        // EXERCISE
    	// time = c * O(n)
    	// c = time/O(n)
    	long start = System.nanoTime() / 1000;
    	sort(array);
    	long stop = System.nanoTime() / 1000;
    	long time = stop-start; //something
    	double O = O(array.length);
    	c = time/O;
    }

    /** Predicts the running time of a merge sort for some index n
        @param n
        @return the estimated amount of time in unit microseconds
    */
    public double predict(int n) {
    	 return c * O(n); 
    }

    /** Performs a merge sort using a given input array
        @param array the (unsorted) array
        @return the sorted array
    */
    public E[] sort(E[] array) {
        if (array.length <= 1)
            return array;
        E[] sorted = array.clone();
        E[] array2 = sorted.clone();
        sort(sorted, array2, 0, array.length - 1);
        return sorted;
    }

    private void sort(E[] array1, E[] array2, int first, int last) {
        if (first >= last)
            return;

        int middle = (first + last) / 2;
        sort(array1, array2, first, middle);
        sort(array1, array2, middle+1, last);

        int i = first;
        int a = first;
        int b = middle+1;
        while (a <= middle && b <= last) {
            // EXERCISE

            // Copy the smaller of array[a] or array[b] to array2[i]
            // (in the case of a tie, copy array[a])
            // and increment i and a or b (the one you copied).
            if (array1[a].compareTo(array1[b]) <= 0) {
            	array2[i] = array1[a];
            	i++;
            	a++;
            }
            if (array1[a].compareTo(array1[b])>0) {
            	array2[i] = array1[b];
            	i++;
            	b++;
            }

        }

        // EXERCISE
        // Copy the rest of a or b, whichever is not at the end.
        while (a <= middle) {
        	array2[i] = array1[a];
        	i++;
        	a++;
        }


        System.arraycopy(array2, first, array1, first, last - first + 1);
    }

}
