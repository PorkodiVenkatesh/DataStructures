import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr= {6,5,4,3,2,1};
		int N=arr.length;
		
		
		for(int i=1;i<N;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
