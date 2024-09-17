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
        System.out.println("Лабораторная работа 1 Андреев Костиневич 23ВП2");
        System.out.println("Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести простые числа.");
        System.out.println("Введите количество чисел в массиве:");
        boolean validinput = false;
        while (!validinput){
            try{
                String n = _in.nextLine();
                int size = Integer.parseInt(n);
                if(size>0){
                    validinput = Number.SetSize(size);
                    if (validinput) {
                        System.out.println("Введите числа");
                        break;
                    }
                }else {
                    System.out.println("Размер массива не может быть нулевым или отрицательным");
                }
            }
            catch(Exception ex){
                System.out.println("Значение размера массива может быть только положительным целым числом. Введите заново");
            }
        }
    }

    /**
     * Считывает числа, которые ввел пользователь, и добавляет в массив.
     */
    public void GetNumbers(){
        for (int i = 0;i<Number.ArraySize;i++){
            boolean validinput = false;
            while (!validinput){
                try{
                    String n = _in.nextLine();
                    int number = Integer.parseInt(n);
                    Number num = new Number(number);
                    Number.ArrayNumbers[i] = num;
                    validinput = true;
                }
                catch(Exception ex){
                    System.out.println("Вы ввели нецелое значение. Введите заново");
                }
            }
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
        GetArraySize();
        GetNumbers();
        PrintSimple();
    }
}
