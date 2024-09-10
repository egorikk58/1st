import java.util.Scanner;

public class UserInterface {
    private static final Scanner in = new Scanner(System.in);

    public static void GetArraySize(){
        System.out.println("Введите количество чисел");
        int n = in.nextInt();
        boolean setnums = Number.SetSize(n);
        if(setnums){
            System.out.println("Введите числа");
        }else{
            System.out.println("Произошла ошибка");
        }
    }

    public static void GetNumbers(){
        for(int i = 0;i<Number.arrayNum.length;i++){
            Number.arrayNum[i] = new Number(in.nextInt());
        }
    }

    public static void PrintSimple(){
        System.out.println("Простые числа");
        for(int i=0;i<Number.arrayNum.length;i++){
            if(Number.arrayNum[i].GetSimple()){
                System.out.println(Number.arrayNum[i].GetValue());
            }
        }
    }

    public static void Run(){
        GetArraySize();
        GetNumbers();
        PrintSimple();
    }
}
