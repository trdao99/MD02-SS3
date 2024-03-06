import java.util.Scanner;

public class btap_sang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so row");
        int r = sc.nextInt();
        System.out.println("nhap so col");
        int c = sc.nextInt();
        int[][] arrParrent = new int[r][c];
        int sum = 0;
        do {
            System.out.println("========== MENU===========\n" +
                    "1 Nhập giá trị cho tất cả phần tử mảng \n" +
                    "2 In các phần tử của mảng dưới dạng ma trận\n" +
                    "3 Tính tổng tất cả phần tử mảng \n" +
                    "4 In ra đường chéo chính \n" +
                    "5 In ra đường chéo phụ (phải là ma trận vuông)\n" +
                    "6 In ra đường viền");


            System.out.println("nhap lua chon");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < arrParrent.length; i++) {
                        for (int j = 0; j < arrParrent[i].length; j++) {
                            System.out.printf("nhập phần tử ở vị trí %d-%d : ", i, j);
                            arrParrent[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < arrParrent.length; i++) {
                        for (int j = 0; j < arrParrent[i].length; j++) {
                            System.out.print(arrParrent[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < arrParrent.length; i++) {
                        for (int j = 0; j < arrParrent[i].length; j++) {
                            sum += arrParrent[i][j];
                        }
                    } System.out.println(sum);
                    break;
                case 4:
                    for (int i = 0; i < arrParrent.length; i++) {
                        for (int j = 0; j < arrParrent[i].length; j++) {
                           if(i ==j ){
                               System.out.print(arrParrent[i][j]);
                           }
                           else {
                               System.out.print(" ");
                           }
                        }
                        System.out.println();
                    }
                    break;
                case 5 :
                    if(r==c){
                        for (int i = 0; i < arrParrent.length; i++) {
                            for (int j = 0; j < arrParrent[i].length; j++){
                                if (j+i == arrParrent[i].length-1 ) {
                                    System.out.print(arrParrent[i][j]);
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    else{
                        System.out.println("ko có đường chéo phụ");
                        break;
                    }
                case 6:
                    for (int i = 0; i < arrParrent.length; i++) {
                        for (int j = 0; j < arrParrent[i].length; j++) {
                            if(i==0||j==0||j== arrParrent[i].length-1||i==arrParrent.length-1 ){
                                System.out.print(arrParrent[i][j]+"\t");
                            }
                            else {
                                System.out.print("\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

            }
        } while (true);
    }
}
