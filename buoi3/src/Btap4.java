public class Btap4 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {9, 7, 8}};
        int max = arr[0][0];
        for( int i =0; i< arr.length;i++){
            for ( int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("số lơn nhất là số %d",max);
    }
}
