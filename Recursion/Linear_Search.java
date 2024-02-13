public class Linear_Search {
    static int linearSearch(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return linearSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 2, 9 };
        int target = 7;

        int ans = linearSearch(arr, target, 0);

        System.out.println(ans);
    }
}
