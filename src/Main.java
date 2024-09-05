import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n(количество элементов)");
        int n = in.nextInt();
        System.out.println("Введите числа");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Ваши простые числа");
        for (int i = 0; i < nums.length; i++) {
            boolean Flag = true;
            for (int p = 2;p <= Math.sqrt(nums[i]);p++){
                if (nums[i] % p == 0){
                    Flag = false;
                }
            }
            if (Flag == true){
                System.out.println(nums[i]);
            }
        }
    }
}