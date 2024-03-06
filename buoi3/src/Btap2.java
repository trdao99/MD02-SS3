import java.util.Scanner;

public class Btap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] newArr = new int[arr.length+1];
        System.out.println("Nhập số muốn chèn:");
        int numNew = sc.nextInt();
        System.out.println("Nhập index muốn chèn:");
        int index = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                newArr[count] = numNew;
                count+=1;
            }
            newArr[count] = arr[i];
            count++;
        }
        for(int item : newArr){
            System.out.print(item+" ");
        }
    }
}