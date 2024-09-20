public class CWH_29_Practice_Set6 {
    public static void main(String[] args) {
        // // Practice Problem 1
        // float[] arr = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
        // float sum = 0;
        // for (float element : arr) {
        // sum = sum + element;
        // }
        // System.out.println("The value of sum is " + sum);

        // // Practice Problem 2
        // float[] arr = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
        // float num = 45.7f;
        // boolean isInArray = false;
        // for (float element : arr) {
        // if (num == element) {
        // isInArray = true;
        // break;
        // }
        // }
        // if (isInArray) {
        // System.out.println("The value is present in the array.");
        // } else {
        // System.out.println("The value is not present in the array.");

        // }

        // // Practice Problem 3
        // float[] marks = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
        // float sum = 0;
        // for (float element : marks) {
        // sum = sum + element;
        // }
        // System.out.println("The value of average marks is " + sum / marks.length);

        // // Practice Problem 4
        // int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        // int[][] mat2 = { { 2, 6, 13 }, { 3, 7, 1 } };
        // int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };
        // for (int i = 0; i < mat1.length; i++) { // row number of times
        // for (int j = 0; j < mat1[i].length; j++) { // column number of times
        // System.out.format("Setting values for i = %d and j= %d\n", i, j);
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // }
        // }
        // for (int i = 0; i < mat1.length; i++) { // row number of times
        // for (int j = 0; j < mat1[i].length; j++) { // column number of times
        // System.out.print(result[i][j] + " ");
        // }
        // System.out.println(); // Prints a new line
        // }

        // // Practice Problem 5
        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;
        // for (int i = 0; i < n; i++) {
        // temp = arr[i];
        // // Swap a[i] and a[l-1-i]
        // arr[i] = arr[l - 1 - i];
        // arr[l - 1 - i] = temp;
        // }
        // for (int element : arr) {
        // System.out.println(element);
        // }

        // // Practice Problem 6
        // int[] arr = { 1, -2100, -3, 455, 5, 34, 67 };
        // int max = Integer.MAX_VALUE;
        // for (int e : arr) {
        // if (e > max) {
        // max = e;
        // }
        // }
        // System.out.println("The value of the maximum element in this array is : " +
        // max);

        // // Practice Problem 7
        // int[] arr = { 1, 2100, 3, 455, 5, 34, 67 };
        // int min = Integer.MAX_VALUE;
        // for (int e : arr) {
        // if (e < min) {
        // min = e;
        // }
        // }
        // System.out.println("The value of the maximum element in this array is : " +
        // min);

        // Practice Problem 8
        boolean isSorted = true;
        int[] arr = { 1, 2100, 3, 455, 5, 34, 67 };
        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

    }
}
