package DZ2;

public class Main {
    public static void main(String[] args) {

        int[][] masArray = {{2, 4, 6, 8}, {3, 5, 1, 6}, {9, 7, 8, 1}, {1, 5, 9, 4}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(masArray[i][j]);
            }
            System.out.println();
        }
    }

    public static int sizeMas(int i) throws MyArraySizeException {
        if (4 != i) {
            return i;
        }
        throw new MyArraySizeException();


    }

}



