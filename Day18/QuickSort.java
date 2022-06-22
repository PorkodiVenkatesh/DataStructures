package Sorting;

import java.util.Arrays;

public class QuickSort {
	public static void swap(int arr[] , int pos1, int pos2){
		
		if(pos1 != pos2) {
		int temp;
		temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
		}
	}

	public static int partition(int arr[], int low, int high, int pivot){
		int i = low;
		int j = low;
		while( i <= high){
			if(arr[i] > pivot){
				i++;
			}
			else{
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		return j-1;
	}

	public static void quickSort(int arr[], int low, int high){
		if(low < high){
		int pivot = arr[high];
		int pos = partition(arr, low, high, pivot);
		
		quickSort(arr, low, pos-1);
		quickSort(arr, pos+1, high);
		}
	}

	public static void main(String[] args) {
		int arr[] = {6, 3, 14, 9, 8, 15, 7};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length -1);
		System.out.println(Arrays.toString(arr));
	}

}
