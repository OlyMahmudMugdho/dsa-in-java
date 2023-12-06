public class MergeSort {

    static void merge(int arr[],int left, int middle,int right) {
        int n1 = middle - left + 1 ;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i  < n1; i++){
            L[i] = arr[left+i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[middle + 1 + j];
        }


        int i = 0,j=0;
        int k = left;

        while (i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
    static void mergeSort(int arr[],int left,int right){
        if (left >= right) {
            return ;
        }
        if(left < right) {
            int middle = (left  + right)/2;
            mergeSort(arr,left,middle);
            mergeSort(arr,(middle+1),right);
            merge(arr,left,middle,right);
        }


    }
    public static void main(String[] args) {
        int[] nums = {2,86,3,9,0,3};
        mergeSort(nums,0,(nums.length-1));
        for (int i=0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
