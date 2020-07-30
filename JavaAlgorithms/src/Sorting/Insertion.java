package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Insertion {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int[] sorted_arr = new int[6];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 6 values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Given array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out. print(arr[i]+ " ");
		}
		
		sorted_arr = insertionSort(arr);	
		System.out.println("Sorted array(Insertion): ");
		for (int i =0; i< sorted_arr.length; i++) {
			System.out.print(sorted_arr[i]+" ");
		}
		}
	
	public static int[] insertionSort(int[] arr) {
		int i, j, key,temp;
		for (i =1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >=0 && key < arr[j]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		return arr;
		
	}
}
