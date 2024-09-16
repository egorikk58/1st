import java.util.Scanner;

/**
 * Класс для реализации пользовательского интерфейса (ввод/вывод).
 */
public class UserInterface {

    /**
     * Объект класса {@code Scanner} для ввода чисел с консоли.
     */
    private final Scanner _in;

    /**
     * Конструктор по умолчанию.
     * Инициализируют поле {@code _in}
     */
    public UserInterface() {
        _in = new Scanner(System.in);
    }

    /**
     * Просит пользователя ввести размер массива и устанавливает его.
     * Сообщает об ошибке, если не удалось установить размер.
     */
    public void GetArraySize(){
            System.out.println("Введите N");
            int n = _in.nextInt();
            boolean SetNums = Number.SetSize(n);
            if (SetNums) {
                System.out.println("Введите числа");
            } else {
                System.out.println("Произошла ошибка");
            }
        }

    /**
     * Считывает числа, которые ввел пользователь, и добавляет в массив.
     */
    public void GetNumbers(){
        for (int i = 0;i<Number.ArraySize;i++){
            Number.ArrayNumbers[i] = new Number(_in.nextInt());
        }
    }

    /**
     * Выводит на экран простые числа из массива.
     */
    public void PrintSimple(){
        System.out.println("Простые числа");
        for (int i =0; i<Number.ArraySize;i++){
            if (Number.ArrayNumbers[i].GetSimple()){
                System.out.println(Number.ArrayNumbers[i].GetValue());
            }
        }
    }

    /**
     * Запускает выполнение программы.
     * Последовательно вызывает методы для ввода размера массива, чисел и вывода простых чисел.
     * В случае возникновения исключения выводит сообщение об ошибке, предупреждая
     * пользователя о необходимости ввести целое число.
     */
    public void Run(){
        try {
            GetArraySize();
            GetNumbers();
            PrintSimple();
        }
        catch (Exception ex){
            System.out.println("Произошла ошибка, введите int значение");
        }
    }
}
