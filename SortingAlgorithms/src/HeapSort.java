public class HeapSort {

    public static void maxHeapify(int[] a, int i, int heapsize){
        int l = 2*i+1;
        int r = 2*i+2;
        int largest = i;
        if(l<=heapsize && a[l]> a[largest])
            largest = l;
        if(r<=heapsize && a[r]>a[largest])
            largest =r;
        if(largest!=i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            maxHeapify(a,largest,heapsize);
        }
    }

    public static void buildMaxHeap(int[] a) {
        int heapsize = a.length-1;
        for(int i = a.length/2; i>=0;i--){
            maxHeapify(a,i,heapsize);
        }

    }

    public static void sort(int[] a) {
        buildMaxHeap(a);
        int heapsize = a.length-1;
        for(int j =a.length-1;j>=0;j--){
            int temp = a[0];
            a[0] = a[j];
            a[j] = temp;
            heapsize-=1;
            maxHeapify(a,0,heapsize);
        }
    }

    public static void main(String[] args) {
        int[] num = {4,1,3,2,16,9,10,14,8,7};
        sort(num);
        for(int i : num)
            System.out.println(i);
    }
}
