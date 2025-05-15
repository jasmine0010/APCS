public class Search {
    
    private static int[] arr = {1, 3, 5, 7, 9};
    
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(binarySearch(arr, 3));
    }
}