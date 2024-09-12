import java.util.Scanner;
public class UserInterface {
    private static final Scanner in = new Scanner(System.in);

    public static void GetArraySize(){
        try {
            System.out.println("Enter N");
            int n = in.nextInt();
            boolean SetNums = Number.SetSize(n);
            if (SetNums == true) {
                System.out.println("Введите числа");
            } else {
                System.out.println("Произошла ошибка");
            }
        }
        catch (Exception exp){
            System.out.println("Произошла ошибка ,введите int значение");
        }
    }

    public static void GetNumbers(){
        for (int i = 0;i<Number.ArraySize;i++){
            Number.ArrayNumbers[i] = new Number(in.nextInt());
        }
    }
    public static void PrintSimple(){
        System.out.println("Простые числа");
        for (int i =0; i<Number.ArraySize;i++){
            if (Number.ArrayNumbers[i].GetSimple()){
                System.out.println(Number.ArrayNumbers[i].GetValue());
            }
        }
    }
    public static void Run(){
        GetArraySize();
        GetNumbers();
        PrintSimple();
    }
}
