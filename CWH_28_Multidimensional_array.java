public class CWH_28_Multidimensional_array {
    public static void main(String[] args) {
        // int[] marks; // A 1-D array
        int[][] flats; // A 2-D array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array in reverse order (Quick Quiz)
        System.out.println("Printing the 2-D Array in reverse order : ");
        for (int[] flat : flats) {
            for (int j = 0; j < flat.length; j++) {
                System.out.print(flat[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        // String[][][] arr = new String[2][3][4]; // An example of 3-D array
    }
}
