public class Btap9 {
    public static void main(String[] args) {
        int[] arr = {-5,-4,-4, -8, 5, -7, -15};
        int max = arr[0];
        int max2 =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max ) {
                max2=max;
                max = arr[i];
            }
            if (arr[i] > max2 && arr[i] != max ) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
