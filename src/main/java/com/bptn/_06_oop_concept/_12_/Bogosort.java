package com.bptn._06_oop_concept._12_;

public class Bogosort {
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 3, 8, 5, 6, 7};
		bogoSort(arr);
		System.out.println("Finished!");
	}
	
	public static void bogoSort(int[] i) {
		while(!isSorted(i)) {
			shuffle(i);
		}
	}

	private static void shuffle(int[] i) {
		for(int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length), index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	private static boolean isSorted(int[] i) {
		for(int x = 0; x < i.length - 1; ++x) {
			if(i[x] > i[x+1]) {
				return false;
			}
		}
		return true;
	}

}