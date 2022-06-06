public class SumArr {



public static void main(String[] args) {

int[] a1= {9,9,9,9};
int[] a2= {9,9,9};

int a1s=a1.length;
int a2s=a2.length;
int[] sumArr=new int[a1s>a2s ? a1s+1: a2s+1];

int i=sumArr.length-1;
int j=a1.length-1;
int k=a2.length-1;
int carry=0;
while(i>=0) {
int sum=carry;

if(j>=0) {
sum+=a1[j];
j--;
}

if(k>=0) {
sum+=a2[k];
k--;
}

sumArr[i]=sum%10;
carry=sum/10;
i--;

}

for(int num:sumArr) {
System.out.println(num);
}

}
}
