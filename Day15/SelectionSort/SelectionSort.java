package Day15.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr= {4,3,2,1,6,5,7};
		 int n=arr.length;
		 
		 for(int i=0;i<n-1;i++) {
			 int min=i;
			 for(int j=i+1;j<n;j++) {
				 if(arr[j]<arr[min]) {
					 min=j;
				 }
			 }
			 if(min!=i) {
				 int temp=arr[i];
				 arr[i]=arr[min];
				 arr[min]=temp;
			 }
		 }
		 System.out.println(Arrays.toString(arr));
	}
}
