public class Binary_Search {
    static int binarySearch(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, high);
            } else {
                return binarySearch(arr, target, low, mid - 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 9, 12 };
        int target = 7;

        int ans = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }
}
