import java.util.Scanner;

public class buoi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] diems = new float[3];
        float diemTb = 0;
        for (int i = 0; i < diems.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("nhap diem hoa");
                    break;
                case 1:
                    System.out.println("nhap diem ly");
                    break;
                case 2:
                    System.out.println("nhap diem toan");
                    break;
            }
            diems[i] = sc.nextFloat();
            diemTb += diems[i];
        }
        System.out.println("diem trung binh la: " + diemTb/diems.length);
    }
}