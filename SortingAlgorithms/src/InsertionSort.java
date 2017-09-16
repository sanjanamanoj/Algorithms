public class InsertionSort {

    public static void sort(int[] nums){
        for(int j=1;j<nums.length;j++){
            int key = nums[j];
            int i =j-1;
            while(i>=0 && nums[i]>key){
                nums[i+1] = nums[i];
                i=i-1;
            }
            nums[i+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        sort(nums);
        for(int i: nums)
            System.out.println(i);
    }

}
