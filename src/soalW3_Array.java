public class soalW3_Array {
    public static void main(String[] args) {
    //isi value array tsb
    int[] arraySatu = {2, 5, 3};
    int[] arrayDua = {9, 5, 3};
    int[] arrayTiga = {2, 4, 9};
    int[] arrayEmpat = {10, 11, 12};
    int[] arrayLima = {13, 14, 15};
    int[] aarrayEnam = {16, 17, 18};
    int[] arrayTujuh = {19, 20, 21};
    int[] arrayDelapan = {22, 23, 24};
    int[] arraySembilan = {25, 26, 27};
    //buat array 2 dimensi
    int[][] twoDArrOne = {arraySatu, arrayDua, arrayTiga};
    int[][] twoDArrTwo = {arrayEmpat, arrayLima, aarrayEnam};
    int[][] twoDArrThree = {arrayTujuh, arrayDelapan, arraySembilan};
    //buat 3 dimensi array
    int[][][] threeDimensionalArray = {twoDArrOne, twoDArrTwo, twoDArrThree};

    //print array 3 dimensi
    for (int i = 0; i < threeDimensionalArray.length; i++) {
        System.out.print("{ ");
    for (int j = 0; j < threeDimensionalArray[i].length; j++) {
        System.out.print("{ ");
    for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
        System.out.print(threeDimensionalArray[i][j][k] + " ");
    }
    System.out.print("} ");
    }
    System.out.println("}");
        }
    }
}
