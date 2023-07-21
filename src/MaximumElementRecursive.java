public class MaximumElementRecursive {

    public static int findMaxRecursive(int[] A, int start, int end) {
        if (start == end) {
            return A[start];
        } else {
            int mid = (start + end) / 2;
            int leftMax = findMaxRecursive(A, start, mid);
            int rightMax = findMaxRecursive(A, mid + 1, end);
            return Math.max(leftMax, rightMax);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] array = {5, 9, 3, 7, 2, 8, 6};
        int maxElement = findMaxRecursive(array, 0, array.length - 1);
        System.out.println("Maximum element: " + maxElement);
    }
}
