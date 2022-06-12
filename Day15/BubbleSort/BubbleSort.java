public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,4,6,3,2,1};
		int n=arr.length;
		for(int j=0;j<n-1;j++) {
			for(int i=0;i<n-1-j;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}