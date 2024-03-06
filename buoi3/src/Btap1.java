import java.util.Scanner;

public class Btap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Nhập mảng gồm 5 phần tử: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập phần tử muốn xóa: ");
        int delElement = sc.nextInt();
        int[] newArr = new int[arr.length - 1];
        int newIndex = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != delElement) {
                newArr[newIndex] = arr[j];
                newIndex++;
            }
        }
        System.out.println("Mảng sau khi xóa phần tử:");
        for (int k = 0; k < newArr.length; k++) {
            System.out.println(newArr[k]);
        }
    }
}