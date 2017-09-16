public class QuickSort {

    public static void quickSort(int[] a, int p , int r) {
        if(p<r){
            int q = partition(a,p,r);
            quickSort(a,p,q-1);
            quickSort(a,q+1,r);
        }
    }

    public static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i =p-1;
        for(int j =p;j<r-1;j++){
            if(a[j] <= x){
                i = i+1;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int[] a  = {2,8,7,1,3,5,6,4};
        quickSort(a,0,a.length-1);
        for(int c : a)
            System.out.println(c);
    }

}
