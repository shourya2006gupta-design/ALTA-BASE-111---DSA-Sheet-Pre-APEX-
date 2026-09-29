//QUESTION
// Write a program that declares a 3x3 two-dimensional array, fills it with the numbers 1 to 9 in row-major order, and prints it as a 3x3 grid. Output:
// 1 2 3
// 4 5 6
// 7 8 9

public class Day27 {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};//declares a 3x3 two-dimensional array

        for (int i=0;i<3;i++){ //printing the 2D array
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
