public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for(int j = 1; j<arr.length; j++){
            int key = arr[j];
            int i = j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        for(int c : arr)
//            System.out.println(c);
        insertionSort(arr);
        for(int c : arr)
            System.out.println(c);
    }
}
