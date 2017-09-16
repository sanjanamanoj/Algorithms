public class MergeSort {

    public static void mergeSort(int[] a,int p, int r){
        if(p<r){
            int q = (p+r)/2;
            mergeSort(a,p,q);
            mergeSort(a,q+1,r);
            merge(a,p,q,r);
        }
    }

    public static void merge(int[] a,int p, int q, int r){
        int n1 = q-p+1;
        int n2 = r-q;
        int[] left = new int[n1+1];
        int[] right = new int[n2+1];
        for(int i= 0;i<n1;i++)
            left[i] = a[p+i];
        for(int i= 0;i<n2;i++)
            right[i] = a[q+i+1];
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;
        int i=0, j=0;
        for(int k = p; k<=r;k++){
            if(left[i]<right[j]){
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }

        }

    }

    public static void main(String[] args) {
        int[] a = { 3,4,5,1,2,7,8,9};
        mergeSort(a,0,4);
//        merge(a,0,2,4);
        for(int c : a)
            System.out.println(c);
    }
}
