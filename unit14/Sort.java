public class Sort {
    private static int[] arr = {9, 3, 6, 7, 0};
    
    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
    
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[arr.length - mid];
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        
        for (int i = mid; i < arr.length; i++) {
            arr2[i - mid] = arr[i];
        }
        
        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);
        
        return merge(arr1, arr2);
    }
    
    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int count = 0;
        int aCount = 0;
        int bCount = 0;
        while (aCount < a.length && bCount < b.length) {
            if (a[aCount] <= b[bCount]) {
                c[count] = a[aCount];
                aCount++;
            } else {
                c[count] = b[bCount];
                bCount++;
            }
            count++;
        }
        while (aCount < a.length) {
            c[count] = a[aCount];
            aCount++;
            count++;
        }
        while (bCount < b.length) {
            c[count] = b[bCount];
            bCount++;
            count++;
        }
        return c;
    }
    
    public static void main(String[] args) {
        for (int i: arr) System.out.print(i + " ");
        System.out.println();
        
        bubbleSort(arr);
        
        for (int i: arr) System.out.print(i + " ");
        System.out.println();
    }
}