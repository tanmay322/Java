package Sorting;

import java.util.Scanner;

public class Merge {
	
	private static void printArray(int[] arr) {
		for (int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	private static int[] mergeSort(int[] arr) {
		//checking if there are more than one elements in array
		if (arr.length <= 1)
			return arr;
		
		int midpoint = arr.length / 2;
		int[] left = new int[midpoint];
		int[] right;
		
		if(arr.length % 2 == 0) //if even then 
			right = new int[midpoint];
		else //if array is odd then 
			right = new int[midpoint + 1];
		//filling the left array with values up to midpoint
		//---------
		for ( int i=0; i < midpoint; i++) {
			left[i] = arr[i];
		}
		//filling the right array with value from midpoint
		for (int j = 0; j<right.length; j++) {
			right[j] = arr[midpoint + j];
		}
		
		int[] sorted_arr = new int[arr.length];
		//recursive call for merge Sort for array
		left = mergeSort(left);
		right = mergeSort(right);
		
		sorted_arr = merge(left, right);
		return sorted_arr;
	}
	
	private static int[] merge(int[] left, int[] right) {
		
		int[] sorted_arr = new int[left.length + right.length];
		int left_ptr, right_ptr, sorted_ptr;
		left_ptr = right_ptr = sorted_ptr = 0;
		
		//if left array and right array has elements
		while(left_ptr < left.length || right_ptr < right.length) {
			
			if(left_ptr < left.length && right_ptr < right.length) {
				//sorting the array, comparing left & right array
				if(left[left_ptr] < right[right_ptr]) {
					sorted_arr[sorted_ptr++] = left[left_ptr++];
				}else {
					sorted_arr[sorted_ptr++] = right[right_ptr++];
				}
			}
			//if only left array has elements
			else if(left_ptr < left.length) {
				sorted_arr[sorted_ptr++] = left[left_ptr++];
			}
			//if only right array has elements
			else if(right_ptr < right.length)
				sorted_arr[sorted_ptr++] = right[right_ptr++];		
		}
		return sorted_arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,4,3,2,1};
		System.out.println("Initial array: ");
		printArray(arr);
		
		arr = mergeSort(arr);
		System.out.println("Sorted array: ");
		printArray(arr);
	}
}

