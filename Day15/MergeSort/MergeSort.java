package Day15.MergeSort;

import java.util.Arrays;

public class MergeSort {
    

    public static void main(String[] args) {
		

        int[] a= {5,4 ,3, 2, 1, 6};
        int l=0;
        int r=a.length-1;
        
        mergeSort(a,l,r);
        
        System.out.println(Arrays.toString(a));
    }
        
    public static void mergeSort(int[] a,int l,int r) {
            if(l<r) {
                int mid=(l+r)/2;
                mergeSort(a,l,mid);
                mergeSort(a,mid+1,r);
                merge(a,l,mid,r);
            }
    }
        
    public static void merge(int[] a,int l,int mid,int r) {
             
            int n1 = mid - l + 1;    
            int n2 = r - mid;    
              
            
            int LeftArray[] = new int[n1];  
            int RightArray[] = new int[n2];  
              
             
            for (int i = 0; i < n1; i++)    
            LeftArray[i] = a[l + i];    
            for (int j = 0; j < n2; j++)    
            RightArray[j] = a[mid + 1 + j];    
           
            int i, j, k;  
            i = 0;   
            j = 0;    
            k = l;    
            while (i < n1 && j < n2)    
            {    //5				4
                if(LeftArray[i] <= RightArray[j])    
                {    
                    a[k] = LeftArray[i];    
                    i++;    
                }    
                else    
                {    
                    a[k] = RightArray[j];    
                    j++;    
                }    
                k++;    
            }    
            while (i<n1)    
            {    
                a[k] = LeftArray[i];    
                i++;    
                k++;    
            }    
            while (j<n2)    
            {    
                a[k] = RightArray[j];    
                j++;    
                k++;    
            }       
    }
}
