public class Btap3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {7,8,9,10};
        int[] totalArr = new int[arr1.length + arr2.length];
        for(int i=0; i<totalArr.length; i++){
            if(i<arr1.length){
                totalArr[i] = arr1[i];
            }
            else{
                totalArr[i] = arr2[i - arr2.length];
            }
        }
        for(int item : totalArr){
            System.out.println(item);
        }
    }
}
