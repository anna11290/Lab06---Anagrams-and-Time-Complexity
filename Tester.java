package lab06;

public class Tester {

	public static void main (String[] args) {
		SortedString zeb = new SortedString("zebra");
		System.out.println(zeb);
		SortedString Zeb = new SortedString("Zebra");
		System.out.println(Zeb);
		SortedString joy = new SortedString("joy");
		SortedString ski = new SortedString("ski");
		SortedString bel = new SortedString("below");
		SortedString Elb = new SortedString("Elbow");
		System.out.println("joy.compareTo(ski): " + joy.compareTo(ski)); // expect +
		System.out.println("below.compareTo(Elbow): " + bel.compareTo(Elb)); //expect 0
		System.out.println("zebra.compareTo(joy): " + zeb.compareTo(joy));
		
		SortedString empty = new SortedString("");
		System.out.println("AnagramUtil.areAnagrams(empty, bel): "+AnagramUtil.areAnagrams(empty, bel));
		System.out.println("AnagramUtil.areAnagrams(bel, bel): "+AnagramUtil.areAnagrams(bel, bel));
		System.out.println("AnagramUtil.areAnagrams(Elb, bel): "+AnagramUtil.areAnagrams(Elb, bel));
		System.out.println("AnagramUtil.areAnagrams(zebra, Zebra): "+AnagramUtil.areAnagrams(zeb, Zeb));
		System.out.println("AnagramUtil.areAnagrams(ski, joy): "+AnagramUtil.areAnagrams(ski, joy));
		
		System.out.println("---------------");
		InsertionSort<Integer> intIS = new InsertionSort<Integer>();
		Integer[] one = {1};
		Integer[] two = {6, 2};
		Integer[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] random = {5, 3, 7, 1, 8, 2, 9, 6, 4};
		
		Integer[] IntArr = intIS.sort(one);
		
		String IntArrStr = "[";
		for (Integer i: IntArr) {
			IntArrStr+=i+" ";
			
		}
		IntArrStr+="]";
		
		System.out.println("One element: " + IntArrStr);
		
		IntArr = intIS.sort(two);
		IntArrStr = "[";
		for (Integer i: IntArr) {
			IntArrStr+=i+" ";
			
		}
		IntArrStr+="]";
		System.out.println("Two elements: " + IntArrStr);
		
		IntArr = intIS.sort(sorted);
		IntArrStr = "[";
		for (Integer i: IntArr) {
			IntArrStr+=i+" ";
			
		}
		IntArrStr+="]";
		System.out.println("sorted elements: " + IntArrStr);
		
		IntArr = intIS.sort(random);
		IntArrStr = "[";
		for (Integer i: IntArr) {
			IntArrStr+=i+" ";
			
		}
		IntArrStr+="]";
		System.out.println("random elements: " + IntArrStr);
		
		System.out.println("---------------");
		InsertionSort<SortedString> ssIS = new InsertionSort<SortedString>();
		String[] strArr = {"joy", "ski", "fed", "cat"};
		SortedString[] sortStrArr = SortedString.toSortedString(strArr);
		SortedString[] sortedArr = ssIS.sort(sortStrArr);
		String ssArrStr = "[";
		for (SortedString ss: sortedArr) {
			ssArrStr+=ss.getUnsorted()+" ";
		}
		ssArrStr+="]";
		System.out.println("Sorted SortedString[]: " + ssArrStr);
		
		System.out.println("---------------");
		Integer[] rand = new Integer[10];
		for (int i = 0; i < 10; i++) {
			rand[i] = (int)(Math.random() * 10000);
		}
		intIS.fit(rand);
		System.out.println("To sort 100000 elements it would take: " + intIS.predict(100000) + " microseconds");
		
		//Assignment
		System.out.println("---------------");
		String[] array1 = {"cat", "car"};
		SortedString[] array1Sorted = SortedString.toSortedString(array1);
		String[] array1largestAna = AnagramUtil.getLargestAnagramGroup(array1Sorted);
		String ssarray1 = "[";
		for (String ss: array1largestAna) {
			ssarray1+=ss+" ";
		}
		ssarray1+="]";
		System.out.println("Array1 largest ana: " + ssarray1);
		
		
		String[] array2 = {"elbow", "cat", "below", "car"};
		SortedString[] array2Sorted = SortedString.toSortedString(array2);
		String[] array2largestAna = AnagramUtil.getLargestAnagramGroup(array2Sorted);
		String ssarray2 = "[";
		for (String ss: array2largestAna) {
			ssarray2+=ss+" ";
		}
		ssarray2+="]";
		System.out.println("array2 largest anagram group: " + ssarray2);
		String[] s3 = AnagramUtil.getLargestAnagramGroup("sample_word_list.txt");
		String strings3 = "[";
		for (String ss: s3) {
			strings3+=ss+" ";
		}
		strings3+="]";
		System.out.println("s3 largest anagram group: " + strings3);
		
		//Testing MergeSort
		System.out.println("Testing merge sort---------------");
		MergeSort<Integer> intMS = new MergeSort<Integer>();
		Integer[] oneM = {1};
		Integer[] twoM = {6, 2};
		Integer[] sortedM = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] randomM = {5, 3, 7, 1, 8, 2, 9, 6, 4};
		IntArr = intMS.sort(oneM);
		
		IntArrStr = "[";
		for (Integer i: IntArr) {
			IntArrStr+=i+" ";
			
		}
		IntArrStr+="]";
		
		System.out.println("One element: " + IntArrStr);
		
		IntArr = intMS.sort(twoM);
		IntArrStr = "[";
		for (Integer i: IntArr) {
			IntArrStr+=i+" ";
			
		}
		IntArrStr+="]";
		System.out.println("Two elements: " + IntArrStr);
		
		IntArr = intMS.sort(sortedM);
		IntArrStr = "[";
		for (Integer i: IntArr) {
			IntArrStr+=i+" ";
			
		}
		IntArrStr+="]";
		System.out.println("sorted elements: " + IntArrStr);
		
		IntArr = intMS.sort(randomM);
		IntArrStr = "[";
		for (Integer i: IntArr) {
			IntArrStr+=i+" ";
			
		}
		IntArrStr+="]";
		System.out.println("random elements: " + IntArrStr);
		
		System.out.println("---------------");
		MergeSort<SortedString> ssMS = new MergeSort<SortedString>();
		String[] strArrM = {"joy", "ski", "fed", "cat"};
		SortedString[] sortStrArrM = SortedString.toSortedString(strArrM);
		SortedString[] sortedArrM = ssMS.sort(sortStrArrM);
		ssArrStr = "[";
		for (SortedString ss: sortedArrM) {
			ssArrStr+=ss.getUnsorted()+" ";
		}
		ssArrStr+="]";
		System.out.println("Sorted SortedString[]: " + ssArrStr);
		
		System.out.println("---------------");
		rand = new Integer[10];
		for (int i = 0; i < 10; i++) {
			rand[i] = (int)(Math.random() * 10000);
		}
		intMS.fit(rand);
		System.out.println("To sort 100000 elements it would take: " + intMS.predict(100000) + " microseconds");
	
	}

}
